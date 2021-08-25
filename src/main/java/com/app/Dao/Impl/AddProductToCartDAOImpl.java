package com.app.Dao.Impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.app.Dao.AddProductToCartDAO;
import com.app.dbutil.MysSqlDBconnection;
import com.app.Exception.BusinessException;
import com.app.model.Cart;

public class AddProductToCartDAOImpl implements AddProductToCartDAO {
	private static Logger log = Logger.getLogger(AddProductToCartDAOImpl.class);

	@Override
	public int addProductToCart(Cart cart) throws BusinessException {
		int c = 0;
		try(Connection connection=MysSqlDBconnection.getConnection()){
			String sql="insert into cart(customerId,productId) values(?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, cart.getCustomerId());
			preparedStatement.setInt(2, cart.getProductId());
			c = preparedStatement.executeUpdate();
		
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Product Id doesn't exist");
		}
		return c;
	}


}
