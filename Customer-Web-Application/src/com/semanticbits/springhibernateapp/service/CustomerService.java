package com.semanticbits.springhibernateapp.service;

import java.util.List;

import com.semanticbits.springhibernateapp.entity.Customer;

public interface CustomerService {

	public void saveCustomer(Customer customer);

	public List<Customer> getCustomersList();

	public void deleteCustomer(int id);

	public Customer getById(int id);


}
