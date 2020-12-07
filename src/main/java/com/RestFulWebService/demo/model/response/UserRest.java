package com.RestFulWebService.demo.model.response;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRest {

    private String firstName;
    private String lastName;
    private String email;
    private String userId;

}
