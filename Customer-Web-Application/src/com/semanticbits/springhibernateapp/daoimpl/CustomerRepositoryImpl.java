package com.semanticbits.springhibernateapp.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.semanticbits.springhibernateapp.dao.CustomerRepository;
import com.semanticbits.springhibernateapp.entity.Customer;

/**
 * The Class CustomerRepositoryImpl.
 */
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	/** The session factory. */
	@Autowired
	private SessionFactory sessionFactory;
	
	
	/**
	 * Gets the customers list.
	 *
	 * @return the customers list
	 */
	@SuppressWarnings("deprecation")
	@Override
	@Transactional
	public List<Customer> getCustomersList() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		return (List<Customer>)currentSession.createCriteria(Customer.class).list();
	}

	/**
	 * Save customer.
	 *
	 * @param customer the customer
	 */
	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	/**
	 * Delete customer.
	 *
	 * @param id the id
	 */
	@Override
	@Transactional
	public void deleteCustomer(int id) {
		 Customer customer = (Customer) sessionFactory.getCurrentSession().load(Customer.class, id);
	        if (null != customer) {
	            this.sessionFactory.getCurrentSession().delete(customer);
	        }
	}

	/**
	 * Gets the by id.
	 *
	 * @param id the id
	 * @return the by id
	 */
	@Override
	@Transactional
	public Customer getById(int id) {
		Customer customer = (Customer) sessionFactory.getCurrentSession().get(Customer.class, id);
		return customer;
	}

	/**
	 * Search.
	 *
	 * @param keyword the keyword
	 * @return the list
	 */
	@Override
	@Transactional
	public List<Customer> search(String keyword) {
		List<Customer> list = null;
		list = sessionFactory.getCurrentSession().createQuery("from Customer where first_name LIKE '%"+keyword+"%' OR last_name LIKE '%"+keyword+"%' ", Customer.class).list();
		return list;
	}

	/**
	 * Update customer by id.
	 *
	 * @param id the id
	 * @return the customer
	 */
	@Override
	@Transactional
	public Customer updateCustomerById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class,id);
		
		return customer;
	}

	
}
