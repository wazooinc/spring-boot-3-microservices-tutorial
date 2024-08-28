package com.example.weapon_microservice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.weapon_microservice.models.Weapon;
import com.example.weapon_microservice.services.WeaponService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/weapons")
public class WeaponController {

  final WeaponService weaponService;

  @GetMapping("")
  public List<Weapon> getAll() {
    return weaponService.getAll();
  }
  
}
