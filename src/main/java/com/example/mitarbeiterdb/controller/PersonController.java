package com.example.mitarbeiterdb.controller;

import com.example.mitarbeiterdb.entity.PersonEntity;
import com.example.mitarbeiterdb.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/person")
public class PersonController {
    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PersonEntity>> getAllPersonen() {
        List<PersonEntity> personen = service.findAllPersonen();
        return new ResponseEntity<>(personen, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<PersonEntity> getPersonById(@PathVariable("id") int id) {
        PersonEntity person = service.findPerson(id);
        return new ResponseEntity<>(person, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<PersonEntity> addPerson(@RequestBody PersonEntity person) {
        PersonEntity entity = service.addPerson(person);
        return new ResponseEntity<>(entity, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<PersonEntity> deletePersonById(@PathVariable("id") int id) {
        PersonEntity person = service.deletePerson(id);
        return new ResponseEntity<>(person, HttpStatus.NO_CONTENT);

    }

}
