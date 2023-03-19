package ru.example.MapStructExamples.service;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import ru.example.MapStructExamples.dto.CustomerDto;
import ru.example.MapStructExamples.dto.UserDto;
import ru.example.MapStructExamples.entity.UserEntity;
import ru.example.MapStructExamples.mapper.CustomMapper;
import ru.example.MapStructExamples.mapper.UserMapper;

@Service
public class MapperService {

    private final UserMapper userMapper = Mappers.getMapper(UserMapper.class);

    public CustomerDto getCustomerDto(UserDto userDto) {
        return CustomMapper.INSTANCE.toCustomerDto(userDto);
    }


    public UserDto getUserDto(CustomerDto customerDto) {
        return CustomMapper.INSTANCE.toUserDto(customerDto);
    }

    public UserEntity getUserEntity(UserDto userDto) {
        return userMapper.toEntity(userDto);
    }

}