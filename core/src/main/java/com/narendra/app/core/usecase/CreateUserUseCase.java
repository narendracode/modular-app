package com.narendra.app.core.usecase;

import com.narendra.app.core.dto.User;
import com.narendra.app.core.exception.UserAlreadyExistException;

public interface CreateUserUseCase {
    public void execute(User user) throws UserAlreadyExistException;
}
