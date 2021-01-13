package com.narendra.app.core.usecase;


import com.narendra.app.core.dto.User;
import com.narendra.app.core.exception.UserAlreadyExistException;
import com.narendra.app.core.ports.UserService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateUserUseCaseImpl implements CreateUserUseCase{
    private final UserService userService;

    @Override
    public void execute(User user) throws UserAlreadyExistException {
        if(userService.doesUserExists(user.getName()))
            throw new UserAlreadyExistException();

        userService.saveUser(user);
    }
}
