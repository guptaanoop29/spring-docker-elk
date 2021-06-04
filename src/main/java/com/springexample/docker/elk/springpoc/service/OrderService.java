/**
 * 
 */
package com.springexample.docker.elk.springpoc.service;

import java.util.List;

import com.springexample.docker.elk.springpoc.domain.Order;

/**
 * @author anoop.kumargupta
 *
 */
public interface OrderService {

	List<Order> getOrders();
}
