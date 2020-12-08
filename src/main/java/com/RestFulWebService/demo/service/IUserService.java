package com.RestFulWebService.demo.service;

import com.RestFulWebService.demo.model.request.UserDetailsRequestModel;
import com.RestFulWebService.demo.model.response.UserRest;

public interface IUserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
}
