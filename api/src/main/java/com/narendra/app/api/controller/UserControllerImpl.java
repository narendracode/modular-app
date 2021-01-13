package com.narendra.app.api.controller;


import com.narendra.app.api.response.APIResponse;
import com.narendra.app.core.dto.User;
import com.narendra.app.core.exception.UserAlreadyExistException;
import com.narendra.app.core.usecase.CreateUserUseCase;
import com.narendra.app.core.usecase.GetAllUsersUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserControllerImpl implements UserController{

    @Autowired
    private GetAllUsersUseCase getAllUsersUseCase;

    @Autowired
    private CreateUserUseCase createUserUseCase;

    @Override
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public APIResponse<Collection<User>> getUsers()  {
        return new APIResponse<>(HttpStatus.OK.name(), getAllUsersUseCase.execute());
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public APIResponse<Boolean> createUser(@RequestBody final User user) {
        try{
            createUserUseCase.execute(user);
        }catch (UserAlreadyExistException exception){
            exception.printStackTrace();
            return new APIResponse<Boolean>(HttpStatus.BAD_REQUEST.name(),false);
        }
        return new APIResponse<Boolean>(HttpStatus.OK.name(),true);
    }
}
