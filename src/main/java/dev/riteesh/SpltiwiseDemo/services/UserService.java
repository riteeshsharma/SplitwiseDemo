package dev.riteesh.SpltiwiseDemo.services;

import dev.riteesh.SpltiwiseDemo.exceptions.UserAlreadyExistsException;
import dev.riteesh.SpltiwiseDemo.models.User;
import dev.riteesh.SpltiwiseDemo.models.UserStatus;
import dev.riteesh.SpltiwiseDemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(String userName, String phoneNumber,
                             String password) throws UserAlreadyExistsException {
        Optional<User> userOptional = userRepository.findByPhone(phoneNumber);

        if (userOptional.isPresent()) {
            if (userOptional.get().getUserStatus().equals(UserStatus.ACTIVE)) {
                throw new UserAlreadyExistsException();
            } else {
                User user = userOptional.get();
                user.setUserStatus(UserStatus.ACTIVE);
                user.setName(userName);
                user.setPassword(password);
                return userRepository.save(user);
            }
        }

        User user = new User();
        user.setPhone(phoneNumber);
        user.setName(userName);
        user.setPassword(password);
        user.setUserStatus(UserStatus.ACTIVE);

        return userRepository.save(user);
    }
}


// ExpenseController
// splitwise.com/api/settleUp -> SettleUpController