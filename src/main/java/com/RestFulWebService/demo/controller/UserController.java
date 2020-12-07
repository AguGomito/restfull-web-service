package com.RestFulWebService.demo.controller;

import com.RestFulWebService.demo.model.request.UserDetailsRequestModel;
import com.RestFulWebService.demo.model.response.UserRest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "limit", defaultValue = "50") int limit, @RequestParam(value = "sort", required = false) String sort) {
        return "get user was called with page = " + page + " , limit = " + limit + " , sort = " + sort;
    }

    @GetMapping(path = "/{userId}")
    public ResponseEntity<UserRest> getUser(@PathVariable String userId) {
        UserRest returnValue = new UserRest();

        returnValue.setEmail("test@test.com");
        returnValue.setFirstName("Gomito");
        returnValue.setLastName("Gomito");

        return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserRest> createUser(@Valid @RequestBody UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();

        returnValue.setEmail(userDetails.getEmail());
        returnValue.setFirstName(userDetails.getFirstName());
        returnValue.setLastName(userDetails.getLastName());

        return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
    }

    @PutMapping
    public String updateUser() {
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user was called";
    }

}
