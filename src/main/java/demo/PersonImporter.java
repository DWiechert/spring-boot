package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import demo.entities.Person;
import demo.repositories.PersonRepository;

/**
 * Class that will run after the Spring application has fully started.
 * <p/>
 * Will be the second to run due to its order.
 * 
 * @author Dan Wiechert
 */
@Component
@Order(value = 2)
public class PersonImporter implements CommandLineRunner {
	@Autowired
	PersonRepository personRepo;

	@Override
	public void run(final String... args) throws Exception {
		personRepo.save(new Person("Jack", "Bauer"));
		personRepo.save(new Person("Chloe", "O'Brian"));
		personRepo.save(new Person("Kim", "Bauer"));
		personRepo.save(new Person("David", "Palmer"));
		personRepo.save(new Person("Michelle", "Dessler"));
	}

}
