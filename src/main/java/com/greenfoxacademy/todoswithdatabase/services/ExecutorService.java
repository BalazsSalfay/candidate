package com.greenfoxacademy.todoswithdatabase.services;

import com.greenfoxacademy.todoswithdatabase.models.Executor;
import org.springframework.stereotype.Service;

@Service
public interface ExecutorService {

  Executor getExecutorById(int id);
  void update(Executor executor);
}
