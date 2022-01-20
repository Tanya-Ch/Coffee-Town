package com.tchermnykh.coffeetown.service;

import com.tchermnykh.coffeetown.dto.SweetDto;
import com.tchermnykh.coffeetown.entity.Sweet;
import org.springframework.stereotype.Component;

@Component
public class FirstService {


    public Sweet fromSweetDto(SweetDto sweetDto) {
        Sweet sweet = new Sweet();
        sweet.setName(sweetDto.getName());
        sweet.setPrice(sweetDto.getPrice());

        return sweet;
    }

    public SweetDto fromSweet(Sweet sweet) {
        SweetDto sweetDto = new SweetDto();
        sweetDto.setName(sweet.getName());
        sweetDto.setPrice(sweet.getPrice());

        return sweetDto;
    }
}
