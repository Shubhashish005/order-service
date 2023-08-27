package com.snackoverflow.orderservice.common;

import com.snackoverflow.orderservice.entity.Order;

public class TransactionResponse {
	
	private Order order;
	private String transactionId;
	private Double amount;
	private String message;
	
	public TransactionResponse() {
	}
	
	public TransactionResponse(Order order, String transactionId, Double amount, String message) {
		this.order = order;
		this.transactionId = transactionId;
		this.amount = amount;
		this.message = message;
	}

	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionResponse [order=").append(order).append(", transactionId=").append(transactionId)
				.append(", amount=").append(amount).append(", message=").append(message).append("]");
		return builder.toString();
	}
}
