/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.marlandy.contracttesting.awesomesite.order.api.controller;

import es.marlandy.contracttesting.awesomesite.common.exception.ErrorResponseException;
import es.marlandy.contracttesting.awesomesite.common.exception.NotFoundException;
import es.marlandy.contracttesting.awesomesite.order.model.NewOrder;
import es.marlandy.contracttesting.awesomesite.order.model.Order;
import es.marlandy.contracttesting.awesomesite.order.model.Orders;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.QueryParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marlandy
 */
@RestController
@RequestMapping("/orders")
public class OrderFakeController{
	
	private static final Logger LOG = LoggerFactory.getLogger(OrderFakeController.class);
	
	private static final String ORDER_ID_OK = "27a5c73a-620f-4eba-b052-33c13472b5f4";
	private static final String ORDER_ID_ERROR_RESPONSE = "27a5c73a-620f-4eba-b052-33c13472b5aa";
	
	@RequestMapping(method = RequestMethod.GET)
    public Orders getOrders(@QueryParam("from") Integer from, 
		@QueryParam("limit") Integer limit) {		
        
		LOG.trace("Request for getting orders from {} limit {}", from, limit);
				
		
		final List<Order> orderList = new ArrayList<>();
		orderList.add(createOrderOk());
		orderList.add(createAnotherOtherOrderOk());
		
		return new Orders(orderList);
	
    }
	
	@RequestMapping(value = "{orderId}", method = RequestMethod.GET)
    public Order getById(@PathVariable String orderId) {		
        LOG.trace("Request for getting order {}", orderId);
		Order order = null;
		switch(orderId) {
		case ORDER_ID_OK:
			order = createOrderOk();
			break;
		case ORDER_ID_ERROR_RESPONSE:
			throw new ErrorResponseException(createErrorResponse());
		default:
			throw new NotFoundException();
		} 
		
		return order;
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Order> createOrUpdate(@RequestBody NewOrder newOrder) {
		LOG.trace("Request for creating new Order {}", newOrder);
		return new ResponseEntity<>(createOrderOk(), HttpStatus.OK);
	}
	
	private Order createOrderOk() {
		final Order order = new Order();
		order.setId("27a5c73a-620f-4eba-b052-33c13472b5f4");
		order.setStatus(1);
		order.setPrice(2.22);
		order.setVoucher("ABCDE12");
		return order;
	}
	
	private Order createAnotherOtherOrderOk() {
		final Order order = new Order();
		order.setId("16e5c739-620f-9e00-105f-21c1347265a0");
		order.setStatus(3);
		order.setPrice(19.01);
		//order.setVoucher("ABCDE12");
		return order;
	}
	
	private ErrorResponse createErrorResponse() {		
		return new ErrorResponse(22, "It doesn't work!!");
	}
	
}
