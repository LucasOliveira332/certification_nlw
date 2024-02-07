package com.lucasdev.certification_nlw.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/home")
public class HomeController {

  @GetMapping("/")
  public String GetDefaultString(){
    return "Hello world!";
  }
}
