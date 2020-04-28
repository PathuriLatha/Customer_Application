package com.semanticbits.springhibernateapp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.semanticbits.springhibernateapp.entity.Customer;
import com.semanticbits.springhibernateapp.service.CustomerService;
import com.semanticbits.springhibernateapp.serviceimpl.CustomerServiceImpl;

/**
 * The Class CustomerController.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	/** The customer service. */
	@Autowired
	private CustomerService customerService;
//	private CustomerService customerService = null;
	
	/*
	 * @RequestMapping("/list") public String listCustomer(Model theModel) { return
	 * "list-customer"; // list-customer is jsp page name }
	 */
	
	/**
 * Gets the customers list.
 *
 * @return the customers list
 */
@RequestMapping("/list")
	public ModelAndView getCustomersList() {
//		customerService = new CustomerServiceImpl();
	    List<Customer> listCustomer = customerService.getCustomersList();
	    ModelAndView mav = new ModelAndView("list-customer");
	    mav.addObject("listCustomer", listCustomer);
	    return mav;
	}
	
	/**
	 * New customer form.
	 *
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping("/new")
	public String newCustomerForm(Map<String, Object> model) {
	    Customer customer = new Customer();
	    model.put("customer", customer);
	    return "new_customer";
	}
	
	/**
	 * Save customer.
	 *
	 * @param customer the customer
	 * @return the string
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
	    customerService.saveCustomer(customer);
	    return "redirect:/customer/list";
	}
	
	/**
	 * Delete customer form.
	 *
	 * @param id the id
	 * @return the string
	 */
	@RequestMapping("/delete")
	public String deleteCustomerForm(@RequestParam int id) {
	    customerService.deleteCustomer(id);
	    return "redirect:/customer/list";       
	}
	
	/**
	 * Edits the customer form.
	 *
	 * @param id the id
	 * @return the model and view
	 */
	@RequestMapping("/edit")
	public ModelAndView editCustomerForm(@RequestParam int id) {
	    ModelAndView mav = new ModelAndView("edit_customer");
	    Customer customer = customerService.getById(id);
	    mav.addObject("customer", customer);
	 
	    return mav;
	}
	
	
}
