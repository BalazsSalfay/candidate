package com.greenfoxacademy.todoswithdatabase.repositories;

import com.greenfoxacademy.todoswithdatabase.models.Executor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutorRepository extends CrudRepository<Executor, Integer> {

}
