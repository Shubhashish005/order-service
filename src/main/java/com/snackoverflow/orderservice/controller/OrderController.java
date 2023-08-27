package com.snackoverflow.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.snackoverflow.orderservice.common.TransactionRequest;
import com.snackoverflow.orderservice.common.TransactionResponse;
import com.snackoverflow.orderservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest orderRequest) throws JsonProcessingException {
		return orderService.saveOrder(orderRequest);
	}
}
