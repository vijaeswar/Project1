package com.app.Dao;
import java.util.List;

import com.app.Exception.BusinessException;
import com.app.model.Cart;

public interface ViewCartDAO {
	public List<Cart> viewCart(Cart cart) throws BusinessException;


}
