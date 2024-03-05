package com.example.mitarbeiterdb.controller;

import com.example.mitarbeiterdb.entity.StandortEntity;
import com.example.mitarbeiterdb.service.StandortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/standort")
@CrossOrigin(origins = "http://localhost:4200")
public class StandortController {

    private final StandortService standortService;

    @Autowired
    public StandortController(StandortService standortService) {
        this.standortService = standortService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<StandortEntity>> getAllStandorte() {
        List<StandortEntity> standorte = standortService.findAllStandorte();
        return new ResponseEntity<>(standorte, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<StandortEntity> getStandortById(@PathVariable("id") int id) {
        StandortEntity standort = standortService.findStandort(id);
        return new ResponseEntity<>(standort, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<StandortEntity> addStandort(@RequestBody StandortEntity standort) {
        StandortEntity entity = standortService.addStandort(standort);
        return new ResponseEntity<>(entity, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<StandortEntity> deleteStandortById(@PathVariable("id") int id) {
        StandortEntity standort = standortService.deleteStandort(id);
        return new ResponseEntity<>(standort, HttpStatus.NO_CONTENT);

    }

}
