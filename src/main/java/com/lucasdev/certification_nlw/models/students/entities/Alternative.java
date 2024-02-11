package com.lucasdev.certification_nlw.models.students.entities;

import java.util.UUID;

import org.springframework.context.annotation.Description;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name= "alternatives")
public class Alternative {
  @Id
  private UUID id;
  
  @Column(name = "description")
  private String Description;

  @ManyToOne
  @JoinColumn(name = "question_id")
  private Question questions;
}
