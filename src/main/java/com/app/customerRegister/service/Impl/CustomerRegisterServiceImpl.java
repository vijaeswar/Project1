package com.app.customerRegister.service.Impl;
import com.app.Dao.CustomerRegisterDAO;
import com.app.Dao.Impl.CustomerRegisterDAOImpl;
import com.app.Exception.BusinessException;
import com.app.customerRegister.service.CustomerRegisterService;
import com.app.model.Customer;
public class CustomerRegisterServiceImpl implements CustomerRegisterService{
	private CustomerRegisterDAO customerRegisterDAO=new CustomerRegisterDAOImpl();

	@Override
	public int registerCustomer(Customer customer) throws BusinessException {
		try {
			if (customerRegisterDAO.customerRegister(customer) == 1) {
				
		}
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return 1;
	}

}
