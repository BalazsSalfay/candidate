package com.greenfoxacademy.todoswithdatabase.repositories;

import com.greenfoxacademy.todoswithdatabase.models.Candidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Integer> {

  List<Candidate> findAllByNameContains(String name);
}
