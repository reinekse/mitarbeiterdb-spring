package com.example.mitarbeiterdb.service;

import com.example.mitarbeiterdb.entity.PersonEntity;
import com.example.mitarbeiterdb.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepo personRepo;

    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public List<PersonEntity> findAllPersonen() {
        return personRepo.findAll();

    }

    public PersonEntity findPerson(long id) {
        Optional<PersonEntity> person = personRepo.findById(id);

        if (person.isPresent()) {
            return person.get();
        } else {
            throw new RuntimeException("Person with id " + id + " not found.");
        }

    }

    public PersonEntity addPerson(PersonEntity person) {
        personRepo.save(person);
        return person;
    }

    public PersonEntity deletePerson(long id) {
        Optional<PersonEntity> person = personRepo.findById(id);
        if (person.isPresent()) {
            personRepo.deleteById(id);
            return person.get();

        } else {
            throw new RuntimeException("Person with id " + id + " not found.");
        }

    }

}
