package com.greenfoxacademy.todoswithdatabase;

import com.greenfoxacademy.todoswithdatabase.factories.CandidateFactory;
import com.greenfoxacademy.todoswithdatabase.factories.ExecutorFactory;
import com.greenfoxacademy.todoswithdatabase.models.Candidate;
import com.greenfoxacademy.todoswithdatabase.models.Executor;
import com.greenfoxacademy.todoswithdatabase.repositories.CandidateRepository;
import com.greenfoxacademy.todoswithdatabase.repositories.ExecutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeathlistApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeathlistApplication.class, args);
	}
}
