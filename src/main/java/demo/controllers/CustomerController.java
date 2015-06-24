package demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

import demo.entities.Customer;
import demo.repositories.CustomerRepository;

/**
 * Controller for the customer endpoints.
 * 
 * @author Dan Wiechert
 */
@RestController
public class CustomerController {
	@Autowired
	CustomerRepository repository;

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello World!";
	}

	@RequestMapping("/allCustomers")
	@ResponseBody
	public List<Customer> allCustomers() {
		return Lists.newArrayList(repository.findAll());
	}

	@RequestMapping("/customer")
	@ResponseBody
	public List<Customer> customerLastName(@RequestParam(value = "firstName", required = false) final String firstName,
			@RequestParam(value = "lastName", required = false) final String lastName) {
		if (!StringUtils.isEmpty(firstName) && !StringUtils.isEmpty(lastName)) {
			return repository.findByFirstNameAndLastName(firstName, lastName);
		} else if (!StringUtils.isEmpty(firstName)) {
			return repository.findByFirstName(firstName);
		} else {
			return repository.findByLastName(lastName);
		}
	}
}
