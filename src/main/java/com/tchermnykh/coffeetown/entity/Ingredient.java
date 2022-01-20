package com.tchermnykh.coffeetown.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Slf4j
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String ingredientName;

    private Integer ingredientPrice;

}
