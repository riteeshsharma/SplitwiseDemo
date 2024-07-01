package dev.riteesh.SpltiwiseDemo.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserResponseDto {
    private Long userId;
    private String status;
    private String message;
}
