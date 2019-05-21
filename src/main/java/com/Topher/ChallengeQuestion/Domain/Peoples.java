package com.Topher.ChallengeQuestion.Domain;

import com.Topher.ChallengeQuestion.Domain.Person;

import java.util.ArrayList;

public class Peoples {
    private ArrayList<Person> people;

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public Peoples(ArrayList<Person> people) {
        this.people = people;
    }

    public Peoples() {

    }

}
