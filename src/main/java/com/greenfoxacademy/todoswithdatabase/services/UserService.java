package com.greenfoxacademy.todoswithdatabase.services;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

  boolean userAccess(String userName, String password);
}
