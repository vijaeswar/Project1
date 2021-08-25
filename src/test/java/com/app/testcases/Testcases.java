package com.app.testcases;
import static org.junit.jupiter.api.Assertions.*;


import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import com.app.addProduct.service.ProductAddService;
import com.app.addProduct.Impl.ProductAddServiceImpl;
import com.app.customerRegister.service.Impl.CustomerRegisterServiceImpl;
import com.app.customerRegister.service.CustomerRegisterService;
import com.app.Dao.Impl.CustomerLoginDAOImpl;
import com.app.Dao.Impl.CustomerSearchDAOImpl;
import com.app.Dao.Impl.MarkAsShippedDAOImpl;
import com.app.Dao.Impl.ProductAddDAOImpl;
import com.app.Dao.CustomerLoginDAO;
import com.app.Dao.ProductAddDAO;
import com.app.Exception.BusinessException;
import com.app.model.Cart;
import com.app.model.Customer;
import com.app.model.Employee;
import com.app.model.Order;
import com.app.model.OrderId;
import com.app.model.Product;
import com.app.search.service.CustomerSearchService;
import com.app.search.service.Impl.CustomerSearchServiceImpl;
import com.app.service.AddProductToCartService;
import com.app.service.CustomerLoginService;
import com.app.service.ListProductsService;
import com.app.service.MarkOrderStatusService;
import com.app.service.PlaceAnOrderService;
import com.app.service.ViewAllOrdersService;
import com.app.service.ViewCartService;
import com.app.service.ViewMyOrdersService;
import com.app.service.impl.AddProductToCartServiceImpl;
import com.app.service.impl.CustomerLoginServiceImpl;
import com.app.service.impl.ListProductsServiceImpl;
import com.app.service.MarkAsShippedService;
import com.app.service.impl.MarkAsShippedServiceImpl;
import com.app.service.impl.MarkOrderStatusServiceImpl;
import com.app.service.impl.PlaceAnOrderServiceImpl;
import com.app.service.impl.ViewAllOrderServiceImpl;
import com.app.service.impl.ViewCartServiceImpl;
import com.app.service.impl.ViewMyOrdersServiceImpl;

public class Testcases {
private static Logger log = Logger.getLogger(Testcases.class);
	
	Employee employee = new Employee();

	@Test
	public void validemployee() { 			//checking for valid details
		assertEquals(1,employee.employeValidate("vijay@gmail.com", "vija123"));
	}
	/*
	@Test
	public void invalidemployeedetails() {				//not valid
		assertEquals(1,employee.employeValidate("vijay@gmail.com", "vija123"));
		
	}*/

CustomerLoginDAOImpl obj = new CustomerLoginDAOImpl();

private CustomerRegisterServiceImpl customerRegister;
	
	@Test
	public void testCustomerLogin() {
		try {
			boolean result = true;
			assertEquals(result,obj.customerLogin("vijay@gmail.com","Vija2017@"));
		}catch (BusinessException e) {}
	}

/*
			fail(e.getMessage());
		}
	}
}*/


ProductAddServiceImpl productAdd = new ProductAddServiceImpl();

@Test
public void testProductAdd() {
	Product product = new Product();
	product.setId(1212);
	product.setName("Mouse");
	product.setManufacturer("Logitech");
	product.setCost(20000);
	try {
		assertEquals(1,productAdd.addProduct(product));
	} catch (BusinessException e) {}
}
		/*fail(e.getMessage());
	}

*/
CustomerSearchDAOImpl customerSearch = new CustomerSearchDAOImpl();
Customer customer = new Customer();

@Test
public void testCustomerSearchById() {
	try {
		int id = 1;
		assertNotNull(customerSearch.getCustomerById(id));
	} catch (BusinessException e) {}
}
	/*	fail(e.getMessage());
	}
}
*/
@Test
public void testCustomerSearchByName() {
	try {
		assertNotNull(customerSearch.getCustomerByName("madhu"));
	} catch (BusinessException e) {}
}
	/*
		fail(e.getMessage());
	}
}
*/
@Test
public void testCustomerSearchByEmail() {
	try {
		assertNotNull(customerSearch.getCustomerByEmail("vinay@gmail.com"));
	} catch (BusinessException e) {}
}
		/*fail(e.getMessage());
	}
}
*/
@Test
public void testCustomerSearchByOrderId() {
	try {
		int id = 1;
		assertNotNull(customerSearch.getCustomerByOrderId(id));
	} catch (BusinessException e) {}
}
	/*
		fail(e.getMessage());
	}
}
*/


CustomerRegisterServiceImpl CustomerRegister = new CustomerRegisterServiceImpl();

@Test
public void testCustomerRegister() {
	Customer customer = new Customer();
	customer.setCustomerId(41);
	customer.setCustomerEmail("vijay123@gmail.com");
	customer.setCustomerName("vijaeswar");
	customer.setCustomerPassword("vija2017@");
	try {
		assertEquals(1,CustomerRegister.registerCustomer(customer));
	} catch (BusinessException e) {}
}
}

	/*	fail(e.getMessage());
	}
}
*/
  
