package dev.drugowick.springthymeleafvuecrudexample.web.dto;

import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private Long roleId;
}
