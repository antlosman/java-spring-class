package com.sda.javaee9spring.repository;

import com.sda.javaee9spring.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Long> { // Long is a type of primary key
}