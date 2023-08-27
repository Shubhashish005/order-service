package com.snackoverflow.orderservice.common;

import com.snackoverflow.orderservice.entity.Order;

public class TransactionRequest {
	
	private Order order;
	private Payment payment;
	
	public TransactionRequest() {
	}
	
	public TransactionRequest(Order order, Payment payment) {
		this.order = order;
		this.payment = payment;
	}

	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public Payment getPayment() {
		return payment;
	}
	
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionRequest [order=").append(order).append(", payment=").append(payment).append("]");
		return builder.toString();
	}
	
	

}
