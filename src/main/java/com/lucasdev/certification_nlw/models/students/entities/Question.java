package com.lucasdev.certification_nlw.models.students.entities;

import java.util.List;
import java.util.UUID;

import org.hibernate.mapping.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@Table(name= "questions")
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(name = "description")
  private String Description;

  @Column(name = "technology")
  private String Technology;

  @OneToMany(mapping)
  private List<Alternative> alternative;
}
