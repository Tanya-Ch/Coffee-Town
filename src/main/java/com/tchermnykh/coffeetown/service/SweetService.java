package com.tchermnykh.coffeetown.service;

import com.tchermnykh.coffeetown.entity.Sweet;
import com.tchermnykh.coffeetown.repository.SweetRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class SweetService {

    private final SweetRepository sweetRepository;

    public SweetService(SweetRepository sweetRepository) {
        this.sweetRepository = sweetRepository;
    }

    @Transactional(readOnly = true)
    public List<Sweet> findAll() {
        return (List<Sweet>) sweetRepository.findAll();
    }

    @Transactional
    public Sweet save(Sweet sweet) {

        Sweet newSweet = sweetRepository.save(sweet);

        return newSweet;
    }
}
