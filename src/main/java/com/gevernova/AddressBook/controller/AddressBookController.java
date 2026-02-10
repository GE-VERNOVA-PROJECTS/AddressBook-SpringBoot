package com.gevernova.AddressBook.controller;


import com.gevernova.AddressBook.dto.AddressBookDTO;
import com.gevernova.AddressBook.model.AddressBookData;
import com.gevernova.AddressBook.service.AddressBookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService service;

    @GetMapping
    public ResponseEntity<List<AddressBookData>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressBookData> getById(@PathVariable int id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping
    public ResponseEntity<AddressBookData> create(
            @Valid @RequestBody AddressBookDTO dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AddressBookData> update(
            @PathVariable int id,
            @Valid @RequestBody AddressBookDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.ok("Address deleted successfully");
    }
}

