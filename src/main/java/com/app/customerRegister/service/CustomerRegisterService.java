package com.app.customerRegister.service;
import com.app.Exception.BusinessException;
import com.app.model.Customer;
public interface CustomerRegisterService {
	public int registerCustomer(Customer customer) throws BusinessException;


}
