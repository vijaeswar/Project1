package com.app.Dao;
import com.app.Exception.BusinessException;
import com.app.model.Order;

public interface MarkAsShippedDAO {
	public int markDelivered(Order order) throws BusinessException;


}
