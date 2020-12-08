package com.RestFulWebService.demo.ws.exceptions;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ErrorMessageEntity {

    private Date timestamp;
    private String message;

}
