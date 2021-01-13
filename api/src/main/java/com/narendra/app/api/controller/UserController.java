package com.narendra.app.api.controller;

import com.narendra.app.api.exception.UserException;
import com.narendra.app.api.response.APIResponse;
import com.narendra.app.core.dto.User;
import java.util.Collection;

public interface UserController {
    APIResponse<Collection<User>> getUsers() throws UserException;
    APIResponse<Boolean> createUser(User user) throws UserException;
}