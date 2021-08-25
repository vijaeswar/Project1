package com.app.service.impl;
import java.util.List;

import com.app.Dao.ListProductsDAO;
import com.app.Dao.Impl.ListProductsDAOImpl;
import com.app.Exception.BusinessException;
import com.app.model.Product;
import com.app.service.ListProductsService;
public class ListProductsServiceImpl implements ListProductsService {
	private ListProductsDAO listProductsDAO=new ListProductsDAOImpl();

	@Override
	public List<Product> listProducts(Product product) throws BusinessException {
		List<Product> products = null;
		try {
			    products = listProductsDAO.listproducts(product);
				
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return products;
	}
	
	


}
