package com.app.service;
import java.util.List;

import com.app.Exception.BusinessException;
import com.app.model.Cart;

public interface ViewCartService {
	public List<Cart> viewCart(Cart cart) throws BusinessException;


}
