package com.Topher.ChallengeQuestion.Repo;

import com.Topher.ChallengeQuestion.Domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person,Long> {

}
