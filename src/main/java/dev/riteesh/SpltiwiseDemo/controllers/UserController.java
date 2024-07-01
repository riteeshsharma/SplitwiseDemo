package dev.riteesh.SpltiwiseDemo.controllers;

import dev.riteesh.SpltiwiseDemo.dtos.RegisterUserRequestDto;
import dev.riteesh.SpltiwiseDemo.dtos.RegisterUserResponseDto;
import dev.riteesh.SpltiwiseDemo.exceptions.UserAlreadyExistsException;
import dev.riteesh.SpltiwiseDemo.models.User;
import dev.riteesh.SpltiwiseDemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public RegisterUserResponseDto registerUser(RegisterUserRequestDto request) {
        User user;
        RegisterUserResponseDto response = new RegisterUserResponseDto();

        try {
            user = userService.registerUser(
                    request.getUserName(),
                    request.getPhoneNumber(),
                    request.getPassword()
            );


            response.setUserId(user.getId());
            response.setStatus("SUCCESS");
        } catch (UserAlreadyExistsException userAlreadyExistsException) {
            response.setStatus("FAILURE");
            response.setMessage(userAlreadyExistsException.getMessage());
        }

        return response;
    }
}
