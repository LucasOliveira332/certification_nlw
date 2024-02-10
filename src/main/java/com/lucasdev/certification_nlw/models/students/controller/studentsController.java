package com.lucasdev.certification_nlw.models.students.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lucasdev.certification_nlw.models.students.dto.VerifyHasCertificationDTO;
import com.lucasdev.certification_nlw.models.students.useCases.VerifyIfHasCertificationUseCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/students")
public class studentsController {
  @Autowired
  private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;
  @PostMapping("")
  public String postMethodName(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
    var hasCertification = this.verifyIfHasCertificationUseCase.Execute(verifyHasCertificationDTO);

    if (!hasCertification){
      return "Usuário pode fazer a prova";
    }
    else{
      return "Usuário não pode fazer a prova";
    }
  }
}
