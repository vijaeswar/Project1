package com.app.addProduct.Impl;
import org.apache.log4j.Logger;

import org.apache.log4j.Logger;

import com.app.Dao.ProductAddDAO;
import com.app.Dao.Impl.ProductAddDAOImpl;
import com.app.Exception.BusinessException;
import com.app.addProduct.service.ProductAddService;
import com.app.model.Product;

public class ProductAddServiceImpl implements ProductAddService  {
private ProductAddDAO productaddDAO=new ProductAddDAOImpl();
	
	private static Logger log = Logger.getLogger(ProductAddServiceImpl.class);

	@Override
	public int addProduct(Product product) throws BusinessException {
		try {
			if (productaddDAO.addProduct(product) == 1) {
				log.info(product);			
			}
		} catch (BusinessException e) {
			throw new BusinessException(e.getMessage());
		}
		return 1;
	}

}
