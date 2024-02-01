package microservicekerjabagus.springbootpersonservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import microservicekerjabagus.springbootpersonservice.repository.PersonRepository;
import microservicekerjabagus.springbootpersonservice.service.IPersonService;
import microservicekerjabagus.springbootpersonservice.entity.Person;

@Service
@RequiredArgsConstructor
public class PersonService implements IPersonService{

    private final PersonRepository personRepository;

    @Override
    public List<Person> getAll(){
        return personRepository.findAll();
    }


    @Override
    public Integer addPerson(Person person){
        return personRepository.save(person).getId();
    }



}
