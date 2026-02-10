package com.gevernova.AddressBook.repository;

import com.gevernova.AddressBook.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {
}
