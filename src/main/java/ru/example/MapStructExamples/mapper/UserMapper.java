package ru.example.MapStructExamples.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.example.MapStructExamples.dto.UserDto;
import ru.example.MapStructExamples.entity.UserEntity;

@Mapper
public interface UserMapper {

    @Mapping(source = "firstName", target = "fName")
    @Mapping(source = "lastName", target = "lName")
    @Mapping(source = "secondName", target = "sName")
    @Mapping(source = "age", target = "ageInYears")
    UserEntity toEntity(UserDto userDto);

}