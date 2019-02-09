package com.yang.demo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;



public class User {
        private int id;
        @NotEmpty(message = "Email cannot be empty")
        private String email;
        private String password;
        @Max(value = 100, message = "Age should not be bigger than 100")
        @Min(value = 18, message = "Age should be at least 18")
        private int age;



    public User(int id, String email, String password, int age) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public int getAge() { return age; }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {this.email = email; }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) { this.age = age;  }
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
