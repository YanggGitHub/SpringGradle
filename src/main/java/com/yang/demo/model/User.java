package com.yang.demo.model;

import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@RestController

public class User {
        private int id;
        @NotEmpty(message = "Email cannot be empty")
        private String email;
        private String password;
//        @Max(value = 100, message = "Age should not be bigger than 100")
//        @Min(value = 18, message = "Age should be at least 18")

    public User(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

//public class User {
//    private int id;
//    @NotEmpty(message = "Email cannot be empty")
//    private String email;
//    private String password;
//    @Max(value = 100, message = "Age should not be bigger than 100")
//    @Min(value = 18, message = "Age should be at least 18")
//    private int age;
//
//}
