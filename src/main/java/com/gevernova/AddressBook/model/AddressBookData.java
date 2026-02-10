package com.gevernova.AddressBook.model;
import lombok.Data;

@Data
public class AddressBookData {

    private int id;
    private String name;
    private String address;
    private String phone;

    public AddressBookData(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}

