package com.greenfoxacademy.todoswithdatabase.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Candidate {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private boolean isUrgent;
  private boolean isDone;

  public Candidate() {
  }

  public Candidate(String name, boolean isUrgent, boolean isDone) {
    this.name = name;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean getIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean getIsDone() {
    return isDone;
  }

  public void setIsDone(boolean done) {
    isDone = done;
  }
}
