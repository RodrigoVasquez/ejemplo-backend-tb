package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Customer;

@Local
public interface CustomerEJBLocal {
	
	List<Customer> get();
	
	Customer get(int id);
	
	void add(Customer customer);
	
	void update(Customer customer);
	
}
