package com.lucasdev.certification_nlw.models.students.useCases;

import org.springframework.stereotype.Service;

import com.lucasdev.certification_nlw.models.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {
  public boolean Execute(VerifyHasCertificationDTO verifyHasCertificationDTO){
    if (verifyHasCertificationDTO.getEmail().equals("lucas@hotmail.com") && verifyHasCertificationDTO.getTechnology().equals("JAVA")){
      return true;
    }
    else {
      return  false;
    }
  }
}
