package com.example.store.payload.customer_management.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateCustomerRequest {
    
    @NotBlank
    @Size(min=4, max=40)
    private String name;

    @Size(max=40)
    @Email
    private String email;

    @Size(max=100)
    private String address;

    @Size(max=100)
    private String mobileNo;

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getAddress(){
        return address;
    }

    public String getMobileNo(){
        return mobileNo;
    }
}