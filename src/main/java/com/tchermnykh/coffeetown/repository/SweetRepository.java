package com.tchermnykh.coffeetown.repository;

import com.tchermnykh.coffeetown.entity.Sweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SweetRepository extends JpaRepository<Sweet, String>, JpaSpecificationExecutor<Sweet> {
}
