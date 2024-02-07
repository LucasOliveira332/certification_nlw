package com.lucasdev.certification_nlw.models.students.entities;

import java.util.UUID;

public class AnswersCertificationsEntity {
  public UUID id;
  public UUID certificationId;
  public UUID studentId;
  public UUID questionId;
  public UUID answerID;
  private boolean isCorrect;
}
