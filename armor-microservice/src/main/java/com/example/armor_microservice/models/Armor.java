package com.example.armor_microservice.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Armor {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;

  String description;

  LocalDateTime createdAt;

  LocalDateTime updatedAt;
  
}
