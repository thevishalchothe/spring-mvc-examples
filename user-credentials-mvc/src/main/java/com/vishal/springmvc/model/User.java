package com.vishal.springmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String uname;
    private String username;
    private String password;
    private String email;
    private String mobileNumber;

}
