package com.app.service.impl;

import java.util.List;

import com.app.Dao.ViewMyOrdersDAO;
import com.app.Dao.Impl.ViewCartDAOImpl;
import com.app.Dao.Impl.ViewMyOrdersDAOImpl;
import com.app.Exception.BusinessException;
import com.app.model.Order;
import com.app.service.ViewMyOrdersService;
public class ViewMyOrdersServiceImpl implements ViewMyOrdersService {

	private ViewMyOrdersDAO viewMyOrdersDAO=new ViewMyOrdersDAOImpl();

	@Override
	public List<Order> viewMyOrders(Order order) throws BusinessException {
		List<Order> orderList = null;
		try {
			    orderList = viewMyOrdersDAO.viewMyOrders(order);
				
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return orderList;
	}

	


}
