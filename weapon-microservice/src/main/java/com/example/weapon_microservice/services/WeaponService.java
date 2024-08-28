package com.example.weapon_microservice.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.weapon_microservice.models.Weapon;
import com.example.weapon_microservice.repositories.WeaponRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WeaponService {

  final WeaponRepository weaponRepository;

  public List<Weapon> getAll() {
    return weaponRepository.findAll();
  }

  public Weapon save(Weapon updatedWeapon) {
    if (updatedWeapon.getId() == null) {
      updatedWeapon.setCreatedAt(LocalDateTime.now());
    }

    updatedWeapon.setUpdatedAt(LocalDateTime.now());
    return weaponRepository.save(updatedWeapon);
  }
  

}