package com.greenfoxacademy.todoswithdatabase.factories;

import com.greenfoxacademy.todoswithdatabase.models.Executor;
import org.springframework.stereotype.Component;

@Component
public class ExecutorFactory {

  public Executor getNewExecutor() {
    return new Executor();
  }
}
