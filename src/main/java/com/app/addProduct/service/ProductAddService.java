package com.app.addProduct.service;

import com.app.Exception.BusinessException;
import com.app.model.Product;
public interface ProductAddService {
	public int addProduct(Product product) throws BusinessException;
	

}
