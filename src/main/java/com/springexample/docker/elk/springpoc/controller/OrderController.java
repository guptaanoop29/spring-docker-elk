/**
 * 
 */
package com.springexample.docker.elk.springpoc.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springexample.docker.elk.springpoc.domain.Order;
import com.springexample.docker.elk.springpoc.service.OrderService;

import lombok.RequiredArgsConstructor;

/**
 * @author anoop.kumargupta
 *
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

	private final OrderService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Order>> getOrders() {
        List<Order> order = service.getOrders();
        return ResponseEntity.ok(order);
    }

	/*
	 * @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	 * public ResponseEntity<PostWithComments> getPost(@PathVariable Long id) {
	 * PostWithComments postWithComments =
	 * service.getPost(id).orElseThrow(ResourceNotFoundException::new); return
	 * ResponseEntity.ok(postWithComments); }
	 */
}
