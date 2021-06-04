/**
 * 
 */
package com.springexample.docker.elk.springpoc.service.impl;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.springexample.docker.elk.springpoc.domain.Order;
import com.springexample.docker.elk.springpoc.service.OrderService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @author anoop.kumargupta
 *
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

	private static final List<Order> ORDERS = new ArrayList<>();
	 static {

		 ORDERS.add(Order.builder()
	                .id(1L)
	                .details("Laptop HP 15 Entry Level")
	                .totalCost("Rs 25,950")
	                .orderDateTime(OffsetDateTime.now(ZoneOffset.UTC))
	                .build());

		 ORDERS.add(Order.builder()
	                .id(2L)
	                .details("Laptop Lenovo Ideapad S145")
	                .totalCost("Rs 29,990")
	                .orderDateTime(OffsetDateTime.now(ZoneOffset.UTC))
	                .build());
	    }
	
	@Override
    public List<Order> getOrders() {
        log.info("Finding details of all orders" + ORDERS.toString());
        
        return ORDERS;
    }
}
