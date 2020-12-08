package com.RestFulWebService.demo.service;

import com.RestFulWebService.demo.model.request.UserDetailsRequestModel;
import com.RestFulWebService.demo.model.response.UserRest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserService implements IUserService {

    Map<String, UserRest> users;

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();

        returnValue.setEmail(userDetails.getEmail());
        returnValue.setFirstName(userDetails.getFirstName());
        returnValue.setLastName(userDetails.getLastName());

        returnValue.setUserId(UUID.randomUUID().toString());

        if (users == null)
            users = new HashMap<>();

        users.put(returnValue.getUserId(), returnValue);

        return returnValue;
    }

}
