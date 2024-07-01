package dev.riteesh.SpltiwiseDemo.dtos;

import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserRequestDto {
    private String password;
    private String phoneNumber;
    private String userName;
}
