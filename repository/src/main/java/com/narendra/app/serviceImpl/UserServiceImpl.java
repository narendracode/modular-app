package com.narendra.app.serviceImpl;
import com.narendra.app.converter.UserRepositoryConverter;
import com.narendra.app.core.dto.User;
import com.narendra.app.core.ports.UserService;
import com.narendra.app.repository.UserRepository;
import lombok.AllArgsConstructor;
import java.util.Collection;
import java.util.stream.Collectors;

@AllArgsConstructor
public class UserServiceImpl implements  UserService {
    public UserRepository userRepository;
    public UserRepositoryConverter userRepositoryConverter;

    @Override
    public Collection<User> getAllUsers() {
        return userRepository
                .findAll()
                .stream()
                .map(userEntity -> userRepositoryConverter.mapToDto(userEntity))
                .collect(Collectors.toList());
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(userRepositoryConverter.mapToEntity(user));
    }

    @Override
    public Boolean doesUserExists(String name) {
        return !userRepository.findByName(name).isEmpty();
    }

}
