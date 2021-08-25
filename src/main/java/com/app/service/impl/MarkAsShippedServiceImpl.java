package com.app.service.impl;

import com.app.Dao.MarkAsShippedDAO;
import com.app.Dao.Impl.MarkAsShippedDAOImpl;
import com.app.Exception.BusinessException;
import com.app.model.Order;
import com.app.service.MarkAsShippedService;
public class MarkAsShippedServiceImpl implements MarkAsShippedService {
	private MarkAsShippedDAO markDeliveredDAO=new MarkAsShippedDAOImpl();

	@Override
	public int markDelivered(Order order) throws BusinessException {
		try {
			if (markDeliveredDAO.markDelivered(order)==1) {
				
		}
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return 1;
	}

}
