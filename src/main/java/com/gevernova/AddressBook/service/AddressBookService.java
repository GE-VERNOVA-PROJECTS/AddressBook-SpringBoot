package com.gevernova.AddressBook.service;


import com.gevernova.AddressBook.dto.AddressBookDTO;
import com.gevernova.AddressBook.exception.AddressBookException;
import com.gevernova.AddressBook.model.AddressBookData;
import com.gevernova.AddressBook.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService  {

    @Autowired
    private AddressBookRepository repository;


    public List<AddressBookData> getAll() {
        return repository.findAll();
    }


    public AddressBookData getById(int id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new AddressBookException("Address ID not found"));
    }


    public AddressBookData create(AddressBookDTO dto) {
        AddressBookData data = new AddressBookData();
        data.setName(dto.getName());
        data.setAddress(dto.getAddress());
        data.setPhone(dto.getPhone());
        return repository.save(data);
    }


    public AddressBookData update(int id, AddressBookDTO dto) {
        AddressBookData data = getById(id);
        data.setName(dto.getName());
        data.setAddress(dto.getAddress());
        data.setPhone(dto.getPhone());
        return repository.save(data);
    }


    public void delete(int id) {
        AddressBookData data = getById(id);
        repository.delete(data);
    }
}

