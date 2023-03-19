package ru.example.MapStructExamples.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserEntity {

    private String fName;
    private String lName;
    private String sName;
    private int ageInYears;

}