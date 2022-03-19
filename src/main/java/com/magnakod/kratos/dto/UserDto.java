package com.magnakod.kratos.dto;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter

public class UserDto implements Serializable {

    private String id;
    private DateTime created_date;
    private String username;
    private String userType;



}
