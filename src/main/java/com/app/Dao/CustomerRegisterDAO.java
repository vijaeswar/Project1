package com.app.Dao;
import com.app.Exception.BusinessException;
import com.app.model.Customer;

public interface CustomerRegisterDAO {
	public int customerRegister(Customer customer) throws BusinessException;


}
