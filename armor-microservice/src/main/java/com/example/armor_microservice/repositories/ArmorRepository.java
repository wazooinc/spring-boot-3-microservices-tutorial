package com.example.armor_microservice.repositories;

import org.springframework.data.repository.ListCrudRepository;

import com.example.armor_microservice.models.Armor;

public interface ArmorRepository extends ListCrudRepository<Armor, Long> {

}
