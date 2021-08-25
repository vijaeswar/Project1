package com.app.Dao;
import java.util.List;

import com.app.Exception.*;
import com.app.model.*;
public interface CustomerSearchDAO {

	public Customer getCustomerById(int id) throws BusinessException;
	public List<Customer> getCustomerByName(String customerName) throws BusinessException;
	public Customer getCustomerByEmail (String customerEmail) throws BusinessException;
	public OrderId getCustomerByOrderId(int orderId) throws BusinessException; 

}
