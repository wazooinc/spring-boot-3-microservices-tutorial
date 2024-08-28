package com.example.armor_microservice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.armor_microservice.models.Armor;
import com.example.armor_microservice.services.ArmorService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ArmorDataLoader implements CommandLineRunner {

  final ArmorService armorService;

  @Override
  public void run(String... args) throws Exception {
    if (armorService.getAll().size() == 0) {
      Armor armor1 = Armor.builder().description("cloth").build();
      Armor armor2 = Armor.builder().description("chain mail").build();
      Armor armor3 = Armor.builder().description("plate mail").build();

      armorService.save(armor1);
      armorService.save(armor2);
      armorService.save(armor3);
    }
  }
}
