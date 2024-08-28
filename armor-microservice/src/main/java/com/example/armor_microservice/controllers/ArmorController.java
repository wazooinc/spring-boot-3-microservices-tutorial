package com.example.armor_microservice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.armor_microservice.models.Armor;
import com.example.armor_microservice.services.ArmorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/armors")
public class ArmorController {

  final ArmorService armorService;

  @GetMapping("")
  public List<Armor> getAll() {
    return armorService.getAll();
  }

}
