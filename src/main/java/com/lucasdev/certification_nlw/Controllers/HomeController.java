package com.lucasdev.certification_nlw.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/home")
public class HomeController {
  record User(String nome, int age){}

  @GetMapping("/")
  public User GetDefaultString(){
    var user = new User("Lucas", 22);
    return user;
  }

}
