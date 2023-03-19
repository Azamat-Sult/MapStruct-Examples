package ru.example.MapStructExamples.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.example.MapStructExamples.dto.CustomerDto;
import ru.example.MapStructExamples.dto.UserDto;
import ru.example.MapStructExamples.entity.UserEntity;
import ru.example.MapStructExamples.service.MapperService;

@RestController
@RequestMapping("/mapper")
@RequiredArgsConstructor
public class MapperController {

    private final MapperService mapperService;

    @PostMapping("/getcustomer")
    public ResponseEntity<CustomerDto> getCustomerDto(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(mapperService.getCustomerDto(userDto), HttpStatus.OK);
    }

    @PostMapping("/getuser")
    public ResponseEntity<UserDto> getUserDto(@RequestBody CustomerDto customerDto) {
        return new ResponseEntity<>(mapperService.getUserDto(customerDto), HttpStatus.OK);
    }

    @PostMapping("/getuserentity")
    public ResponseEntity<UserEntity> getUserEntity(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(mapperService.getUserEntity(userDto), HttpStatus.OK);
    }

}