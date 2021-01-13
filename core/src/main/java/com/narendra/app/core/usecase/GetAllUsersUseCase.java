package com.narendra.app.core.usecase;

import com.narendra.app.core.dto.User;

import java.util.Collection;

public interface GetAllUsersUseCase {
    public Collection<User> execute();
}
