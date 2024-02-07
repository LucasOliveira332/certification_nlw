package com.lucasdev.certification_nlw.models.students.entities;

import java.util.List;
import java.util.UUID;

public class CertificationStudentEntity {
  private UUID id;
  private UUID studentId;
  private String technology;
  private int grade;
  private List<AnswersCertificationsEntity> answersCertificationsEntity;
}
