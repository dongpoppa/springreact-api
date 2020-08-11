package com.vn.springreact.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter

public class UserDto implements Serializable {

    private int id;

    private String userName;

    private String email;

    private String password;

    private String phone;

    private String avatar;

    private String address;

    private String status;


}
