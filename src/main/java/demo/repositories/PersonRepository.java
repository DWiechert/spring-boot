package demo.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import demo.entities.Person;

public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
	List<Person> findByFirstName(@Param("firstName") String firstName);

	List<Person> findByLastName(@Param("lastName") String lastName);

	List<Person> findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
