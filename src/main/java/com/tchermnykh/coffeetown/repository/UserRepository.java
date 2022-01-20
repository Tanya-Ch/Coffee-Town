package com.tchermnykh.coffeetown.repository;


import com.tchermnykh.coffeetown.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {

}
