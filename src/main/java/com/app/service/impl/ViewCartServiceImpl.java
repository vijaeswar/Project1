package com.app.service.impl;

import java.util.List;

import com.app.Dao.ViewCartDAO;
import com.app.Dao.Impl.ViewCartDAOImpl;
import com.app.Exception.BusinessException;
import com.app.model.Cart;
import com.app.service.ViewCartService;
public class ViewCartServiceImpl implements ViewCartService {
	
	private ViewCartDAO viewCartDAO=new ViewCartDAOImpl();

	@Override
	public List<Cart> viewCart(Cart cart) throws BusinessException {
		List<Cart> cartList = null;
		try {
			    cartList = viewCartDAO.viewCart(cart);
				
				
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return cartList;
	}

}
