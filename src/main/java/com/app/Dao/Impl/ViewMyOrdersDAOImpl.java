package com.app.Dao.Impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.app.Dao.ViewMyOrdersDAO;
import com.app.dbutil.MysSqlDBconnection;
import com.app.Exception.BusinessException;
import com.app.model.Order;
import com.app.model.Product;
public class ViewMyOrdersDAOImpl implements ViewMyOrdersDAO {
	private static Logger log = Logger.getLogger(ViewMyOrdersDAOImpl.class);

	@Override
	public List<Order> viewMyOrders(Order order) throws BusinessException {
		List<Order> ordersList = new ArrayList<>();
		try(Connection connection=MysSqlDBconnection.getConnection()){
			String sql = "select orders.orderId,orders.productId ,orders.customerId,orders.orderStatus,products.productName,products.manufacturer,products.cost from orders join products on products.productId = orders.productId where orders.customerId =?;";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, order.getCustomerId());
			//preparedStatement.setInt(2, order.getOrderId());
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Order ordEr= new Order();
				ordEr.setOrderId(resultSet.getInt(1));
				ordEr.setProductId(resultSet.getInt(2));
				ordEr.setCustomerId(resultSet.getInt(3));
				ordEr.setOrderStatus(resultSet.getString(4));
				Product product=new Product();
				product.setName(resultSet.getString(5));
				product.setManufacturer(resultSet.getString(6));
				product.setCost(resultSet.getDouble(7));
				ordEr.setProduct(product);
				ordersList.add(ordEr);
			}
			
			if(ordersList.size()==0) {
				throw new BusinessException("No Orders Placed ");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return ordersList;
	}



}
