package com.app.service;
import com.app.Exception.BusinessException;
import com.app.model.Cart;
public interface PlaceAnOrderService {
	public int placeAnOrder(Cart cart) throws BusinessException;


}
