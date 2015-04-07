package facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Customer;

@Stateless
public class CustomerEJBFacade extends AbstractFacade<Customer>{
	
	@PersistenceContext(unitName = "customerPU")
	private EntityManager em;
	
	public CustomerEJBFacade() {
		super(Customer.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
