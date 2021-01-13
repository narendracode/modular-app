package com.narendra.app.api.configuration;

import com.narendra.app.configuration.RepositoryConfiguration;
import com.narendra.app.converter.UserRepositoryConverter;
import com.narendra.app.core.usecase.CreateUserUseCaseImpl;
import com.narendra.app.core.usecase.GetAllUsersUseCaseImpl;
import com.narendra.app.repository.UserRepository;
import com.narendra.app.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(value = {RepositoryConfiguration.class})
public class UserConfiguration {
    @Autowired
    private UserRepository userRepository;

    @Bean
    public UserRepositoryConverter createUserRepositoryConverter() {
        return new UserRepositoryConverter();
    }

    @Bean
    public UserServiceImpl createUserService(){
        return new UserServiceImpl(userRepository,createUserRepositoryConverter());
    }

    @Bean
    public GetAllUsersUseCaseImpl getAllUsersUseCase(){
        return new GetAllUsersUseCaseImpl(createUserService());
    }

    @Bean
    public CreateUserUseCaseImpl createCreateUserUseCase(){
        return new CreateUserUseCaseImpl(createUserService());
    }
}
