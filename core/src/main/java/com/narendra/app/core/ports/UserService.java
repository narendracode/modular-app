package com.narendra.app.core.ports;

import com.narendra.app.core.dto.User;

import java.util.Collection;

public interface UserService {
    public Collection<User> getAllUsers();
    public void saveUser(User user);
    public Boolean doesUserExists(String name);
}
