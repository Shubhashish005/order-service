package com.snackoverflow.orderservice.common;

public class Payment {

	private Integer paymentId;
	private String paymentStatus;
	private String transactionId;
	private Integer orderId;
	private Double amount;
	
	public Payment() {
	}

	public Payment(Integer paymentId, String paymentStatus, String transactionId, Integer orderId, Double amount) {
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
		this.orderId = orderId;
		this.amount = amount;
	}

	public Integer getPaymentId() {
		return paymentId;
	}
	
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	
	public String getPaytmentStatus() {
		return paymentStatus;
	}
	
	public void setPaytmentStatus(String paytmentStatus) {
		this.paymentStatus = paytmentStatus;
	}
	
	public String getTransactionId() {
		return transactionId;
	}
	
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Payment [paymentId=").append(paymentId).append(", paymentStatus=").append(paymentStatus)
				.append(", transactionId=").append(transactionId).append(", orderId=").append(orderId)
				.append(", amount=").append(amount).append("]");
		return builder.toString();
	}
}
