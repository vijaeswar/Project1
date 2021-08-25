
package com.app.Dao.Impl;
import com.app.Dao.CustomerSearchDAO;
import com.app.dbutil.MysSqlDBconnection;
import com.app.Exception.BusinessException;
import com.app.model.Cart;
import com.app.model.Customer;
import com.app.model.Order;
import com.app.model.OrderId;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
public class CustomerSearchDAOImpl implements CustomerSearchDAO {
	private static Logger log = Logger.getLogger(CustomerSearchDAOImpl.class);

	@Override
	public Customer getCustomerById(int id) throws BusinessException {
		Customer customer =null;
		try(Connection connection=MysSqlDBconnection.getConnection()){
			String sql="select customerId,customerName,customerEmail,customerPassword from customers where customerId=?;";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				customer=new Customer();
				customer.setCustomerId(id);
				customer.setCustomerName(resultSet.getString("customerName"));
				customer.setCustomerEmail(resultSet.getString("customerEmail"));
				customer.setCustomerPassword(resultSet.getString("customerPassword"));
				
			}else {
				throw new BusinessException("Entered customer id "+id+" doesnt exist");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return customer;
	}
			


	@Override
	public List<Customer> getCustomerByName(String customerName) throws BusinessException {
		List<Customer> customers=new ArrayList<>();
		try(Connection connection=MysSqlDBconnection.getConnection()){
			String sql="select customerId,customerName,customerEmail,customerPassword from customers where customerName =?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, customerName);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Customer customer=new Customer();
				customer.setCustomerId(resultSet.getInt("customerId"));
				customer.setCustomerName(resultSet.getString("customerName"));
				customer.setCustomerEmail(resultSet.getString("customerEmail"));
				customer.setCustomerPassword(resultSet.getString("customerPassword"));
				//customer.setOrderId(resultSet.getInt("orderId"));
				customers.add(customer);
				
			}
			
			if(customers.size()==0) {
				throw new BusinessException("No Customers for the name "+customerName);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return customers;
	}

	@Override
	public Customer getCustomerByEmail(String customerEmail) throws BusinessException {
		Customer email =null;
		try(Connection connection=MysSqlDBconnection.getConnection()){
			String sql="select customerId,customerName,customerEmail,customerPassword from customers where customerEmail=?;";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, customerEmail);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				email =new Customer();
				email.setCustomerId(resultSet.getInt("customerId"));
				email.setCustomerName(resultSet.getString("customerName"));
				email.setCustomerEmail(resultSet.getString("customerEmail"));
				email.setCustomerPassword(resultSet.getString("customerPassword"));
				//email.setOrderId(resultSet.getInt("orderId"));
			}else {
				throw new BusinessException("Entered Email "+customerEmail+" doesnt exist");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return email;
	}

	@Override
	public OrderId getCustomerByOrderId(int orderId) throws BusinessException {
		OrderId customer =null;
		Order order = new Order();
		try(Connection connection=MysSqlDBconnection.getConnection()){
			String sql="select  orders.orderId,orders.customerId ,customers.customerName,customers.customerEmail  from orders join customers on orders.customerId = customers.customerId where orders.orderId =?" ;
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, orderId);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				order.setOrderId(resultSet.getInt(1));
				order.setCustomerId(resultSet.getInt(2));
				customer=new OrderId();
				customer.setCustomerName(resultSet.getString(3));
				customer.setCustomerEmail(resultSet.getString(4));
				customer.setOrder(order);
				
				
				
			}else {
				throw new BusinessException("Entered Order Id "+orderId+" doesnt exist");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return customer;
	}
	
	
	

}
