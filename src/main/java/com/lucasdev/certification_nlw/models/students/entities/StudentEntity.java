package com.lucasdev.certification_nlw.models.students.entities;

import java.util.List;
import java.util.UUID;

public class StudentEntity {
  private UUID id;
  private String email;
  private List<CertificationStudentEntity> certificationStudentEntity;
}
