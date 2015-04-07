package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import ejb.CustomerEJBLocal;
import model.Customer;

@Path("/customers")
public class CustomerService {
	
	@EJB
	CustomerEJBLocal customerEJB;
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<Customer> findAll(){
		return customerEJB.get();
	}
	
	@GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Customer find(@PathParam("id") Integer id) {
        return customerEJB.get(id);
    }
	
	@POST
    @Consumes({"application/xml", "application/json"})
    public void create(Customer entity) {
        customerEJB.add(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Customer entity) {
        customerEJB.update(entity);
    }
	

}
