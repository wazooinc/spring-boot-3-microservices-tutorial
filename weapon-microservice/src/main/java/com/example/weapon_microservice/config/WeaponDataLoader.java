package com.example.weapon_microservice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.weapon_microservice.models.Weapon;
import com.example.weapon_microservice.services.WeaponService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class WeaponDataLoader implements CommandLineRunner {

  final WeaponService weaponService;

  @Override
  public void run(String... args) throws Exception {
    if (weaponService.getAll().size() == 0) {
      Weapon weapon1 = Weapon.builder().description("1h sword").build();
      Weapon weapon2 = Weapon.builder().description("2h sword").build();
      Weapon weapon3 = Weapon.builder().description("bastard sword").build();

      weaponService.save(weapon1);
      weaponService.save(weapon2);
      weaponService.save(weapon3);
    }
  }
}
