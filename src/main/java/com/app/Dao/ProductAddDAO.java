package com.app.Dao;
import com.app.Exception.BusinessException;
import com.app.model.Product;
public interface ProductAddDAO {

	public int addProduct(Product product) throws BusinessException;

}
