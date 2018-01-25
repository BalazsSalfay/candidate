package com.greenfoxacademy.todoswithdatabase.services;

import com.greenfoxacademy.todoswithdatabase.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  User user;

  private boolean accessGranted;

  public boolean isAccessGranted() {
    return accessGranted;
  }

  public void setAccessGranted(boolean accessGranted) {
    this.accessGranted = accessGranted;
  }

  @Override
  public boolean userAccess(String userName, String password) {
    if (userName.equals("noone") && password.equals("valarmorghulis")) {
     this.accessGranted = true;
    }
    return this.accessGranted;
  }
}
