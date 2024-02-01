package microservicekerjabagus.springbootpersonservice.service;

import java.util.List;

import microservicekerjabagus.springbootpersonservice.entity.Person;

public interface IPersonService {
    List<Person> getAll();
    Integer addPerson(Person person);
}

