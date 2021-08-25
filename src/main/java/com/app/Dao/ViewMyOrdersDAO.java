package com.app.Dao;
import java.util.List;

import com.app.Exception.BusinessException;
import com.app.model.Order;

public interface ViewMyOrdersDAO {	
	public List<Order> viewMyOrders(Order order) throws BusinessException;


}
