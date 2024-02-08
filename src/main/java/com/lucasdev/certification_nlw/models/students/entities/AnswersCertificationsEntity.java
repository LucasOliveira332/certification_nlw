package com.lucasdev.certification_nlw.models.students.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswersCertificationsEntity {
  public UUID id;
  public UUID certificationId;
  public UUID studentId;
  public UUID questionId;
  public UUID answerID;
  private boolean isCorrect;
}
