package com.greenfoxacademy.todoswithdatabase.services;

import com.greenfoxacademy.todoswithdatabase.models.Executor;
import com.greenfoxacademy.todoswithdatabase.repositories.ExecutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExecutorServiceImpl implements ExecutorService {

  @Autowired
  ExecutorRepository executorRepository;

  @Override
  public Executor getExecutorById(int id) {
    return executorRepository.findOne(id);
  }

  @Override
  public void update(Executor executor) {
    executorRepository.save(executor);
  }
}
