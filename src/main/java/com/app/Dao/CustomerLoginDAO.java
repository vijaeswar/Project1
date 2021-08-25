package com.app.Dao;

import com.app.Exception.BusinessException;
import com.app.model.Customer;
public interface CustomerLoginDAO {
	public boolean customerLogin(String email, String password) throws BusinessException;


}
