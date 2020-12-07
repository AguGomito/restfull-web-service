package com.RestFulWebService.demo.model.request;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserDetailsRequestModel {

    @NotNull(message = "First Name cannot be null")
    @Size(min = 2, message = "First name must not be less than 2 characters")
    private String firstName;

    @NotNull(message = "Last Name cannot be null")
    @Size(min = 2, message = "First name must not be less than 2 characters")
    private String lastName;
}
