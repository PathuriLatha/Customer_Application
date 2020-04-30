package com.semanticbits.springhibernateapp.dao;

import java.util.List;

import javax.persistence.QueryHint;

import com.semanticbits.springhibernateapp.entity.Customer;


public interface CustomerRepository{
	
	public List<Customer> getCustomersList();

	public void saveCustomer(Customer theCustomer);

	public void deleteCustomer(int id);

	public Customer getById(int id);

	public List<Customer> search(String keyword);

	public Customer updateCustomerById(int id);

	
}

