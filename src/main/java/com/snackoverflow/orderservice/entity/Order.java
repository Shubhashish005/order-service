package com.snackoverflow.orderservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ORDER_TB")
public class Order {
	
	@Id
	private Integer id;
	private String name;
	private Integer quantity;
	private Double price;
	
	public Order() {
	}

	public Order(Integer id, String name, Integer quantity, Double price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [id=").append(id).append(", name=").append(name).append(", quantity=").append(quantity)
				.append(", price=").append(price).append("]");
		return builder.toString();
	}
}
