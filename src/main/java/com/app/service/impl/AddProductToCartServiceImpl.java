package com.app.service.impl;
import org.apache.log4j.Logger;

import com.app.Dao.AddProductToCartDAO;
import com.app.Dao.Impl.AddProductToCartDAOImpl;
import com.app.Exception.BusinessException;
import com.app.model.Cart;
import com.app.service.AddProductToCartService;

public class AddProductToCartServiceImpl implements AddProductToCartService {

	private static Logger log = Logger.getLogger(AddProductToCartServiceImpl.class);
	
	private AddProductToCartDAO addProductToCartDAO=new AddProductToCartDAOImpl();

	@Override
	public int addProductToCart(Cart cart) throws BusinessException {
		try {
			if (addProductToCartDAO.addProductToCart(cart)==1) {
				log.info("Product added successfully");
		}
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return 1;
	}

}
