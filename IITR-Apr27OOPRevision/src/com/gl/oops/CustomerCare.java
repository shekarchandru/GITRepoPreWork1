package com.gl.oops;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomerCare {

	ArrayList <CustomerDetails> customers = new ArrayList<CustomerDetails>();
	public void populateCustomers()
	{
		customers.add(new CustomerDetails("C001","Kiran Kumar","RRNagar","8939993993"));
		customers.add(new CustomerDetails("C002","Suman Kumar","RTNagar","8935673993"));
		customers.add(new CustomerDetails("C003","Mohan Kumar","SRNagar","8938973993"));
		customers.add(new CustomerDetails("C004","Rajesh Kumar","KRNagar","8939567993"));
	}
	public CustomerDetails getCustomer(String customerId)
	{
		Iterator <CustomerDetails> custIter = customers.iterator();
		CustomerDetails customerSearch = new CustomerDetails();
		while(custIter.hasNext())
		{
			CustomerDetails customer = custIter.next();
			if(customer.getCustomerID().equals(customerId))
			{
				customerSearch = customer;
				break;
			}
		}
		return customerSearch;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerCare cc = new CustomerCare();
		cc.populateCustomers();
		CustomerDetails customer  = cc.getCustomer("C003");
		System.out.println(customer);
	}

}
