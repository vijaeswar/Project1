package com.app.service.impl;

import com.app.Dao.PlaceAnOrderDAO;
import com.app.Dao.Impl.PlaceAnOrderDAOImpl;
import com.app.Exception.BusinessException;
import com.app.model.Cart;
import com.app.service.PlaceAnOrderService;

public class PlaceAnOrderServiceImpl implements PlaceAnOrderService{
	private PlaceAnOrderDAO placeAnOrderDAO=new PlaceAnOrderDAOImpl();

	@Override
	public int placeAnOrder(Cart cart) throws BusinessException {
		try {
			if (placeAnOrderDAO.placeAnOrder(cart)==1) {
				
		}
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return 1;
	}

}
