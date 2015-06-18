package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import demo.entities.Customer;
import demo.repositories.CustomerRepository;

@Component
public class Importer implements CommandLineRunner {
	@Autowired
	CustomerRepository repository;

	@Override
	public void run(String... args) {
		repository.save(new Customer("Jack", "Bauer"));
		repository.save(new Customer("Chloe", "O'Brian"));
		repository.save(new Customer("Kim", "Bauer"));
		repository.save(new Customer("David", "Palmer"));
		repository.save(new Customer("Michelle", "Dessler"));
	}
}
