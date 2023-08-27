package com.snackoverflow.orderservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.snackoverflow.orderservice.common.Payment;
import com.snackoverflow.orderservice.common.TransactionRequest;
import com.snackoverflow.orderservice.common.TransactionResponse;
import com.snackoverflow.orderservice.entity.Order;
import com.snackoverflow.orderservice.repository.OrderRepository;

@Service
@RefreshScope
public class OrderService {

	private Logger log = LoggerFactory.getLogger(OrderService.class); 
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	@Lazy
	private RestTemplate restTemplate;
	
	@Value("${microservice.payment-service.endpoints.endpoint.uri}")
	private String endpoint_url;
	
	public TransactionResponse saveOrder(TransactionRequest orderRequest) throws JsonProcessingException {
		String responseText = null;
		Order order = orderRequest.getOrder();
		Payment payment = orderRequest.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		
		log.info("Order Service request: {}", new ObjectMapper().writeValueAsString(orderRequest));
		//rest call to payment
		Payment paymentResponse = restTemplate.postForObject(endpoint_url, payment, Payment.class);
		responseText = paymentResponse.getPaytmentStatus().equals("success") ? "payment Process success and order placed" : "Failure in payment processing";
		
		log.info("Payment Service Response from Order service rest call: {}", new ObjectMapper().writeValueAsString(paymentResponse));
		
		orderRepository.save(order);
		return new TransactionResponse(order, paymentResponse.getTransactionId(), paymentResponse.getAmount(), responseText);
	}
}
