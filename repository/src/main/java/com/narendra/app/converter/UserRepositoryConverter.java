package com.narendra.app.converter;

import com.narendra.app.core.dto.User;
import com.narendra.app.entity.UserEntity;

public class UserRepositoryConverter implements RepositoryConverter<UserEntity,User> {
    @Override
    public UserEntity mapToEntity(final User user){
        return  new UserEntity(user.getId(), user.getName(), user.getAge());
    }

    @Override
    public User mapToDto(final UserEntity userEntity){
        return  new User(userEntity.getId(),userEntity.getName(), userEntity.getAge());
    }
}
