package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import demo.entities.Customer;
import demo.repositories.CustomerRepository;

/**
 * Class that will run after the Spring application has fully started.
 * <p/>
 * Will be the first to run due to its order.
 * 
 * @author Dan Wiechert
 */
@Component
@Order(value = 1)
public class CustomerImporter implements CommandLineRunner {
	@Autowired
	CustomerRepository customerRepo;

	@Override
	public void run(final String... args) {
		customerRepo.save(new Customer("Jack", "Bauer"));
		customerRepo.save(new Customer("Chloe", "O'Brian"));
		customerRepo.save(new Customer("Kim", "Bauer"));
		customerRepo.save(new Customer("David", "Palmer"));
		customerRepo.save(new Customer("Michelle", "Dessler"));
	}
}
