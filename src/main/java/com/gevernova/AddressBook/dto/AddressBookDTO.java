package com.gevernova.AddressBook.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AddressBookDTO {
    @NotBlank(message = "Address cannot be empty")
    private String address;

    @NotBlank(message = "Name cannot be empty")
    @Pattern(
            regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",
            message = "Invalid name format"
    )
    private String name;


    @NotBlank(message = "Phone number required")
    @Pattern(
            regexp = "^[6-9][0-9]{9}$",
            message = "Invalid phone number"
    )
    private String phone;
}

