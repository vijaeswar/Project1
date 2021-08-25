package com.app.service.impl;
import com.app.Dao.CustomerLoginDAO;
import com.app.Dao.Impl.CustomerLoginDAOImpl;
import com.app.Exception.BusinessException;
import com.app.service.*;
public class CustomerLoginServiceImpl implements CustomerLoginService {

	private CustomerLoginDAO customerLoginDAO= new CustomerLoginDAOImpl();

	@Override
	public boolean customerLogin(String email, String password) throws BusinessException {
		boolean w = false;
		try {
			if (customerLoginDAO.customerLogin(email,password)) {
				w = true;
				
		}
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return w;
	}
	

}
