package com.tchermnykh.coffeetown.repository;

import com.tchermnykh.coffeetown.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, String>, JpaSpecificationExecutor<Ingredient> {
}
