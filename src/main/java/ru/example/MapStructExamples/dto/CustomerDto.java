package ru.example.MapStructExamples.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDto {

    private String fullName;
    private int years;

}