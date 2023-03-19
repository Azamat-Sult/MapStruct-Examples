package ru.example.MapStructExamples.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {

    private String firstName;
    private String lastName;
    private String secondName;
    private int age;

}