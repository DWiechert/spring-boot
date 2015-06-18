package demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

import demo.entities.Customer;
import demo.repositories.CustomerRepository;

@RestController
public class SampleController {
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
	public List<Customer> customerLastName(@RequestParam(value = "lastName") final String lastName) {
		return repository.findByLastName(lastName);
	}
}
