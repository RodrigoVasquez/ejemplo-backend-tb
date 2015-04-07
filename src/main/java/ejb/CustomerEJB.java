package ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import facade.CustomerEJBFacade;
import model.Customer;

/**
 * Session Bean implementation class CustomerEJB
 */
@Stateless
public class CustomerEJB implements CustomerEJBLocal {

	
	@EJB
	CustomerEJBFacade customerFacade;
	
    public CustomerEJB() {
       
    }

	@Override
	public List<Customer> get() {
		
		return this.customerFacade.findAll();
	}
	
	@Override
	public Customer get(int id) {
		Customer c = new Customer();
		c.setIdcustomer(id);
		return this.customerFacade.find(c);
	}

	@Override
	public void add(Customer customer) {
		
		this.customerFacade.create(customer);
		
	}

	@Override
	public void update(Customer customer) {
		
		this.customerFacade.edit(customer);
		
	}

}
