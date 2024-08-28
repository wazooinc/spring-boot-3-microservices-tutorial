package com.example.weapon_microservice.repositories;

import org.springframework.data.repository.ListCrudRepository;

import com.example.weapon_microservice.models.Weapon;

public interface WeaponRepository extends ListCrudRepository<Weapon, Long> {

}

