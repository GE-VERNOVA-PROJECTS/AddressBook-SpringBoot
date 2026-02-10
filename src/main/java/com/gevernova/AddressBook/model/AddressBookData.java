package com.gevernova.AddressBook.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "address_book")
public class AddressBookData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String address;
    private String phone;
}
