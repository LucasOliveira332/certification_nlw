package com.lucasdev.certification_nlw.models.students.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lucasdev.certification_nlw.models.students.dto.VerifyHasCertificationDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/students")
public class studentsController {
  @PostMapping("")
  public String postMethodName(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
    return "Usuário pode fazer a prova";
  }
}
