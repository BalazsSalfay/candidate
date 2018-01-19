package com.greenfoxacademy.todoswithdatabase.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Executor {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private String ally;


  public Executor() {
    name = "";
    ally = "";
  }

  public Executor(String name, String ally) {
    this.name = name;
    this.ally = ally;
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

  public String getAlly() {
    return ally;
  }

  public void setAlly(String ally) {
    this.ally = ally;
  }

}
