package com.app.service.impl;

import com.app.Dao.MarkOrderStatusDAO;
import com.app.Dao.Impl.MarkOrderStatusDAOImpl;
import com.app.Exception.BusinessException;
import com.app.model.Order;
import com.app.service.MarkOrderStatusService;
public class MarkOrderStatusServiceImpl implements MarkOrderStatusService {
	
	private MarkOrderStatusDAO markOrderDAO=new MarkOrderStatusDAOImpl();

	@Override
	public int markOrderStatus(Order order) throws BusinessException {
		try {
			if (markOrderDAO.markOrderStatus(order)==1) {
				
		}
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return 1;
	}

}
