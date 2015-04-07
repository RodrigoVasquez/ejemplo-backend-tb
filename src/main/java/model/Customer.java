package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idcustomer;

	private String lastnamecustomer;

	private String namecustomer;

	public Customer() {
	}

	public int getIdcustomer() {
		return this.idcustomer;
	}

	public void setIdcustomer(int idcustomer) {
		this.idcustomer = idcustomer;
	}

	public String getLastnamecustomer() {
		return this.lastnamecustomer;
	}

	public void setLastnamecustomer(String lastnamecustomer) {
		this.lastnamecustomer = lastnamecustomer;
	}

	public String getNamecustomer() {
		return this.namecustomer;
	}

	public void setNamecustomer(String namecustomer) {
		this.namecustomer = namecustomer;
	}

}