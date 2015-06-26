package demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import demo.entities.Customer;

/**
 * Simple CRUD repository with extra methods added.
 * <p/>
 * Does not act as a controller due to not having the {@link Param} annotations.
 * 
 * @author Dan Wiechert
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByFirstName(String firstName);

	List<Customer> findByLastName(String lastName);

	List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
}
