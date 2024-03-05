package com.example.mitarbeiterdb.service;

import com.example.mitarbeiterdb.dto.PersonDto;
import com.example.mitarbeiterdb.entity.PersonEntity;
import com.example.mitarbeiterdb.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService {
    private final PersonRepo personRepo;

    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public List<PersonDto> findAllPersonen() {
        List<PersonEntity> entityList = personRepo.findAll();
        return entityList.stream()
                .map(this::convertToPersonDto)
                .collect(Collectors.toList());
    }

    public PersonDto findPerson(int id) {
        Optional<PersonEntity> entityOptional = personRepo.findById(id);

        if (entityOptional.isPresent()) {
            return convertToPersonDto(entityOptional.get());
        } else {
            throw new RuntimeException("Person with id " + id + " not found.");
        }

    }

    public PersonDto addPerson(PersonDto personDto) {
        personRepo.save(convertToPersonEntity(personDto));
        return personDto;
    }

    public PersonDto deletePerson(int id) {
        Optional<PersonEntity> entityOptional = personRepo.findById(id);
        if (entityOptional.isPresent()) {
            personRepo.deleteById(id);
            return convertToPersonDto(entityOptional.get());

        } else {
            throw new RuntimeException("Person with id " + id + " not found.");
        }

    }

    public PersonDto convertToPersonDto(PersonEntity entity) {
        PersonDto dto = new PersonDto();
        dto.setId(entity.getId());
        dto.setNachname(entity.getNachname());
        dto.setVorname(entity.getVorname());
        dto.setGeburtstag(entity.getGeburtstag());
        dto.setAbteilung(entity.getAbteilung());
        dto.setStandortId(entity.getStandortId());
        dto.setAnstellungstag(entity.getAnstellungstag());
        return dto;
    }

    public PersonEntity convertToPersonEntity(PersonDto dto) {
        PersonEntity entity = new PersonEntity();
        entity.setId(dto.getId());
        entity.setNachname(dto.getNachname());
        entity.setVorname(dto.getVorname());
        entity.setGeburtstag(dto.getGeburtstag());
        entity.setAbteilung(dto.getAbteilung());
        entity.setStandortId(dto.getStandortId());
        entity.setAnstellungstag(dto.getAnstellungstag());
        return entity;
    }

}
