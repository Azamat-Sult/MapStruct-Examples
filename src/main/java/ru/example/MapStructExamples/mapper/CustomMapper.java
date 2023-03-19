package ru.example.MapStructExamples.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.example.MapStructExamples.dto.CustomerDto;
import ru.example.MapStructExamples.dto.UserDto;

@Mapper
public interface CustomMapper {

    CustomMapper INSTANCE = Mappers.getMapper(CustomMapper.class);

    default UserDto toUserDto(CustomerDto customerDto) {
        String[] splitedName = customerDto.getFullName().split(" ");
        return new UserDto(splitedName[0], splitedName[1], splitedName[2], customerDto.getYears());
    }

    default CustomerDto toCustomerDto(UserDto userDto) {
        return new CustomerDto(userDto.getFirstName() + " "
                + userDto.getLastName() + " " + userDto.getSecondName(), userDto.getAge());
    }

}