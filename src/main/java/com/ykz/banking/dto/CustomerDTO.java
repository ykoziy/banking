package com.ykz.banking.dto;


import com.ykz.banking.enums.UserRole;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    @NotNull
    private String username;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String pwd;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    @Size(min = 10, max = 10)
    private String phone;

    @NotNull
    private final UserRole role = UserRole.customer;
}
