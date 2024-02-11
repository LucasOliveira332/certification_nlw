package com.lucasdev.certification_nlw.models.students.entities;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.Mapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@Table(name = "students")
public class StudentEntity {
  @Id
  @GeneratedValue(strategy =  GenerationType.UUID)
  private UUID id;
  
  @Column(unique = true, nullable = false)
  private String email;

  @OneToMany(mappedBy = "students", cascade = CascadeType.ALL)
  private List<CertificationStudentEntity> certificationStudentEntity;
}
