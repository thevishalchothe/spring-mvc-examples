package com.vishal.springmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int uid;
    private String uname;
    private String username;
    private String password;
    private String email;
    private String mobileNumber;

}
