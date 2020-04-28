package com.semanticbits.springhibernateapp.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semanticbits.springhibernateapp.dao.CustomerRepository;
import com.semanticbits.springhibernateapp.daoimpl.CustomerRepositoryImpl;
import com.semanticbits.springhibernateapp.entity.Customer;
import com.semanticbits.springhibernateapp.service.CustomerService;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomerServiceImpl.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	/** The customer repository. */
	@Autowired
	private CustomerRepository customerRepository;
//	private CustomerRepository customerRepository = null;
	
	/**
 * Save customer.
 *
 * @param customer the customer
 */
@Override
	public void saveCustomer(Customer customer) {
		customerRepository.saveCustomer(customer);
		
	}
	
	/**
	 * Gets the customers list.
	 *
	 * @return the customers list
	 */
	@Override
	@Transactional
	public List<Customer> getCustomersList() {
//		customerRepository = new CustomerRepositoryImpl();
		List<Customer> list =  null;
		list = customerRepository.getCustomersList();
		return list;
	}

	/**
	 * Delete customer.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteCustomer(int id) {
		customerRepository.deleteCustomer(id);
	}

	/**
	 * Gets the by id.
	 *
	 * @param id the id
	 * @return the by id
	 */
	@Override
	public Customer getById(int id) {
		Customer customer = customerRepository.getById(id);
		return customer;
	}


}
