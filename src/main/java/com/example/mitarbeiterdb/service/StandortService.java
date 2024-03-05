package com.example.mitarbeiterdb.service;

import com.example.mitarbeiterdb.dto.StandortDto;
import com.example.mitarbeiterdb.entity.StandortEntity;
import com.example.mitarbeiterdb.repo.StandortRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StandortService {

    private final StandortRepo standortRepo;

    public StandortService(StandortRepo standortRepo) {
        this.standortRepo = standortRepo;
    }

    public List<StandortDto> findAllStandorte() {
        List<StandortEntity> entityList = standortRepo.findAll();
        return entityList.stream()
                .map(this::convertToStandortDto)
                .collect(Collectors.toList());

    }

    public StandortDto findStandort(int id) {
        Optional<StandortEntity> entityOptional = standortRepo.findById(id);

        if (entityOptional.isPresent()) {
            return convertToStandortDto(entityOptional.get());
        } else {
            throw new RuntimeException("Standort with id " + id + " not found.");
        }

    }

    public StandortDto addStandort(StandortDto standortDto) {
        standortRepo.save(convertToStandortEntity(standortDto));
        return standortDto;
    }

    public StandortDto deleteStandort(int id) {
        Optional<StandortEntity> entityOptional = standortRepo.findById(id);
        if (entityOptional.isPresent()) {
            standortRepo.deleteById(id);
            return convertToStandortDto(entityOptional.get());

        } else {
            throw new RuntimeException("Standort with id " + id + " not found.");
        }

    }

    public StandortDto convertToStandortDto(StandortEntity entity) {
        StandortDto dto = new StandortDto();
        dto.setId(entity.getId());
        dto.setStrasse(entity.getStrasse());
        dto.setHausnummer(entity.getHausnummer());
        dto.setOrt(entity.getOrt());
        dto.setPlz(entity.getPlz());
        return dto;
    }

    public StandortEntity convertToStandortEntity(StandortDto dto) {
        StandortEntity entity = new StandortEntity();
        entity.setId(dto.getId());
        entity.setStrasse(dto.getStrasse());
        entity.setHausnummer(dto.getHausnummer());
        entity.setOrt(dto.getOrt());
        entity.setPlz(dto.getPlz());
        return entity;
    }

}
