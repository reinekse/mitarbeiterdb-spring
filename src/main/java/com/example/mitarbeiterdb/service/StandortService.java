package com.example.mitarbeiterdb.service;

import com.example.mitarbeiterdb.entity.StandortEntity;
import com.example.mitarbeiterdb.repo.StandortRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StandortService {

    private final StandortRepo standortRepo;

    public StandortService(StandortRepo standortRepo) {
        this.standortRepo = standortRepo;
    }

    public List<StandortEntity> findAllStandorte() {
        return standortRepo.findAll();

    }

    public StandortEntity findStandort(int id) {
        Optional<StandortEntity> standort = standortRepo.findById(id);

        if (standort.isPresent()) {
            return standort.get();
        } else {
            throw new RuntimeException("Standort with id " + id + " not found.");
        }

    }

    public StandortEntity addStandort(StandortEntity standort) {
        standortRepo.save(standort);
        return standort;
    }

    public StandortEntity deleteStandort(int id) {
        Optional<StandortEntity> standort = standortRepo.findById(id);
        if (standort.isPresent()) {
            standortRepo.deleteById(id);
            return standort.get();

        } else {
            throw new RuntimeException("Standort with id " + id + " not found.");
        }

    }

}
