package com.app.service;
import java.util.List;

import com.app.Exception.BusinessException;
import com.app.model.Order;

public interface ViewAllOrdersService {
	public List<Order> viewAllOrders(Order order) throws BusinessException;

}
