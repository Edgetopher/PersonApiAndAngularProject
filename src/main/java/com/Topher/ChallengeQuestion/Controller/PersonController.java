package com.Topher.ChallengeQuestion.Controller;

import com.Topher.ChallengeQuestion.Domain.Person;
import com.Topher.ChallengeQuestion.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
@RestController
@CrossOrigin("*")
public class PersonController {

    @Autowired
    public PersonService personService;


    @RequestMapping(value = "/peoples", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Person>> getAllPersons(){
        personService.getAllPerson();
        return new ResponseEntity<>(personService.personRepo.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/peoples", method = RequestMethod.POST)
    public ResponseEntity<?> createPerson(@RequestBody Person person){
        personService.addPerson(person);
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newPollURI = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(person.getId())
                .toUri();
        responseHeaders.setLocation(newPollURI);
        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }

    @RequestMapping( value = "/peoples/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getPerson(@PathVariable Long id){
        Person p =personService.findById(id);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @RequestMapping(value = "/peoples/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/peoples/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updatePerson(@PathVariable Long id, @RequestBody Person person){
        if(personService.personRepo.existsById(id)) {
            personService.updatePerson(person, id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else{
            return createPerson(person);
        }
    }

}
