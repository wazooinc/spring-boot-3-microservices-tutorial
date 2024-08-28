package com.example.armor_microservice.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.armor_microservice.models.Armor;
import com.example.armor_microservice.repositories.ArmorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArmorService {

  final ArmorRepository armorRepository;

  public List<Armor> getAll() {
    return armorRepository.findAll();
  }

  public Armor save(Armor updatedArmor) {
    if (updatedArmor.getId() == null) {
      updatedArmor.setCreatedAt(LocalDateTime.now());
    }

    updatedArmor.setUpdatedAt(LocalDateTime.now());
    return armorRepository.save(updatedArmor);
  }
  

}