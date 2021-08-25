package com.app.Dao;
import java.util.List;

import com.app.Exception.BusinessException;
import com.app.model.Product;

	

public interface ListProductsDAO {
	public List<Product> listproducts(Product product) throws BusinessException;

	

}
