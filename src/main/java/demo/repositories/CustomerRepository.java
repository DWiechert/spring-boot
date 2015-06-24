package demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import demo.entities.Customer;

/**
 * Simple CRUD repository with extra methods added.
 * 
 * @author Dan Wiechert
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByFirstName(String firstName);

	List<Customer> findByLastName(String lastName);

	List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
}
