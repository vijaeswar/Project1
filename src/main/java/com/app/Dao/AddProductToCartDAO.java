package com.app.Dao;

import com.app.Exception.BusinessException;
import com.app.model.Cart;
public interface AddProductToCartDAO {
	public int addProductToCart(Cart cart) throws BusinessException;


}
