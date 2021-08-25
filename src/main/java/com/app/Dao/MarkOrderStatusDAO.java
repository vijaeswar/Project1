package com.app.Dao;
import com.app.Exception.BusinessException;
import com.app.model.Order;
public interface MarkOrderStatusDAO {
	public int markOrderStatus(Order order) throws BusinessException;


}
