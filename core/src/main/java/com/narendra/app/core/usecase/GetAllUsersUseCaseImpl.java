package com.narendra.app.core.usecase;

import com.narendra.app.core.dto.User;
import com.narendra.app.core.ports.UserService;
import lombok.AllArgsConstructor;
import java.util.Collection;

@AllArgsConstructor
public class GetAllUsersUseCaseImpl implements GetAllUsersUseCase{
    private final UserService userService;

    @Override
    public Collection<User> execute() {
        return userService.getAllUsers();
    }
}
