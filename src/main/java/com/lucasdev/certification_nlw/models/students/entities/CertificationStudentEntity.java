package com.lucasdev.certification_nlw.models.students.entities;

import java.util.List;
import java.util.UUID;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "certifications")
public class CertificationStudentEntity {
  @Id
  @GeneratedValue(strategy =  GenerationType.UUID)
  private UUID id;
  private String technology;
  private int grade;

  @ManyToOne
  @JoinColumn(name = "student_id")
  private StudentEntity students;
  // private List<AnswersCertificationsEntity> answersCertificationsEntity;
}
