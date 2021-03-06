package com.greenfoxacademy.todoswithdatabase.controllers;

import com.greenfoxacademy.todoswithdatabase.factories.CandidateFactory;
import com.greenfoxacademy.todoswithdatabase.models.Candidate;
import com.greenfoxacademy.todoswithdatabase.repositories.CandidateRepository;
import com.greenfoxacademy.todoswithdatabase.services.CandidateService;
import com.greenfoxacademy.todoswithdatabase.services.UserService;
import com.greenfoxacademy.todoswithdatabase.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/candidate")
public class CandidateController {

  @Autowired
  CandidateService candidateService;

  @Autowired
  CandidateFactory candidateFactory;

  @Autowired
  CandidateRepository candidateRepository;

  @Autowired
  UserServiceImpl userServiceImpl;

  @GetMapping("/list")
  public String listAllCandidates(Model model) {
    if (userServiceImpl.isAccessGranted()) {
      List<Candidate> candidates = candidateService.getAllCandidate();
      model.addAttribute("candidates", candidates);
      model.addAttribute("newCandidate", candidateFactory.getNewCandidate());
    }
    return "candidate";
  }

  @PostMapping("/create")
  public String createNewCandidate(@ModelAttribute Candidate candidate) {
    if (userServiceImpl.isAccessGranted()) {
      candidateService.create(candidate);
    }
    return "redirect:/candidate/list";
  }

  @PostMapping("/delete/{candidateId}")
  public String deleteCandidate(@PathVariable int candidateId) {
    if (userServiceImpl.isAccessGranted()) {
      candidateService.delete(candidateId);
    }
    return "redirect:/candidate/list";
  }

  @GetMapping("/update/{candidateId}")
  public String showUpdatePage(@PathVariable int candidateId, Model model) {
    if (userServiceImpl.isAccessGranted()) {
      Candidate candidate = candidateService.getCandidateById(candidateId);
      model.addAttribute("candidate", candidate);
    }
    return "update";
  }

  @PostMapping("/update/{candidateId}")
  public String updateCandidate(@PathVariable int candidateId, @ModelAttribute Candidate candidate) {
    if (userServiceImpl.isAccessGranted()) {
      candidate.setId(candidateId);
      candidateService.update(candidate);
    }
    return "redirect:/candidate/list";
  }

  @GetMapping("/search")
  public String searchingCandidate(@RequestParam(value="search", required = false) String search, Model model) {
    if (userServiceImpl.isAccessGranted()) {
      List<Candidate> searchCandidates = candidateService.searchByName(search);
      model.addAttribute("candidates", searchCandidates);
      model.addAttribute("newCandidate", candidateFactory.getNewCandidate());
    }
    return "candidate";
  }
}

