package com.app.Dao;
import com.app.Exception.BusinessException;
import com.app.model.Cart;
public interface PlaceAnOrderDAO {
	public int placeAnOrder(Cart cart) throws BusinessException;


}
