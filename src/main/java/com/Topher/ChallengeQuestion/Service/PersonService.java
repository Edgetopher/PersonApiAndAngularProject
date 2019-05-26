package com.Topher.ChallengeQuestion.Service;

import com.Topher.ChallengeQuestion.Domain.Person;
import com.Topher.ChallengeQuestion.Repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class PersonService {

    @Autowired
    public PersonRepo personRepo;


    public ArrayList<Iterable<Person>> getAllPerson(){
        ArrayList<Iterable<Person>> arrayList = new ArrayList<>();
        for (int i =0; i < personRepo.count(); i++){
            arrayList.add(personRepo.findAll());
        }
        return arrayList;
    }

    public Person findById(Long id){
        return personRepo.findById(id).orElse(null);
    }

    public void addPerson(Person person){
        personRepo.save(person);
    }

    public void deletePerson(Long id){
        personRepo.deleteById(id);
    }
    public void updatePerson(Person person, Long id){
        for(int i =0; i< personRepo.count(); i++){
            if (personRepo.existsById(id)){
                personRepo.save(person);
            }
        }

    }
}
