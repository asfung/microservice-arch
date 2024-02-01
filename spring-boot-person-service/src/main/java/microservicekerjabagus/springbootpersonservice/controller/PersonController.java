package microservicekerjabagus.springbootpersonservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import microservicekerjabagus.springbootpersonservice.entity.Person;
import microservicekerjabagus.springbootpersonservice.service.impl.*;

@RestController
@RequestMapping("/api/v1/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public ResponseEntity<Integer> addPerson(@RequestBody Person person){
        Integer id = personService.addPerson(person);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public List<Person> getAll(){
        return personService.getAll();
    }


}
