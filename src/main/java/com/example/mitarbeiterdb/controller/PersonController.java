package com.example.mitarbeiterdb.controller;

import com.example.mitarbeiterdb.dto.PersonDto;
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
    public ResponseEntity<List<PersonDto>> getAllPersonen() {
        List<PersonDto> personDtoList = service.findAllPersonen();
        return new ResponseEntity<>(personDtoList, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<PersonDto> getPersonById(@PathVariable("id") int id) {
        PersonDto personDto = service.findPerson(id);
        return new ResponseEntity<>(personDto, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<PersonDto> addPerson(@RequestBody PersonDto person) {
        PersonDto personDto = service.addPerson(person);
        return new ResponseEntity<>(personDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<PersonDto> deletePersonById(@PathVariable("id") int id) {
        PersonDto personDto = service.deletePerson(id);
        return new ResponseEntity<>(personDto, HttpStatus.NO_CONTENT);

    }

}
