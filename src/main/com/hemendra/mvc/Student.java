package com.hemendra.mvc;

import javax.validation.constraints.*;

/**
 * Created by hp on 14-06-2017.
 */
public class Student {
    @NotNull(message = "Field Cannot be null!")
    @Size(min = 3, max = 10, message = "First Name should be between 3 and 10")
    private String firstName;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "last name should be of length 5")
    private String lastName;

    @NotNull(message = "Field cannot be blank")
    private String password;

    @NotNull
    @Max(value = 10, message = "Should not be greater than 10")
    @Min(value = 5, message = "Should not be less than 5")
    private Integer phone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                '}';
    }
}
