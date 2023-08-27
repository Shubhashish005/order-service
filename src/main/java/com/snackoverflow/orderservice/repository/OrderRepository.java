package com.snackoverflow.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snackoverflow.orderservice.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
