package microservicekerjabagus.springbootpersonservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import microservicekerjabagus.springbootpersonservice.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
}
