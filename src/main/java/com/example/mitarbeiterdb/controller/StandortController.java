package com.example.mitarbeiterdb.controller;

import com.example.mitarbeiterdb.dto.StandortDto;
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
    public ResponseEntity<List<StandortDto>> getAllStandorte() {
        List<StandortDto> standortDtoList = standortService.findAllStandorte();
        return new ResponseEntity<>(standortDtoList, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<StandortDto> getStandortById(@PathVariable("id") int id) {
        StandortDto standortDto = standortService.findStandort(id);
        return new ResponseEntity<>(standortDto, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<StandortDto> addStandort(@RequestBody StandortDto standort) {
        StandortDto standortDto = standortService.addStandort(standort);
        return new ResponseEntity<>(standortDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<StandortDto> deleteStandortById(@PathVariable("id") int id) {
        StandortDto standortDto = standortService.deleteStandort(id);
        return new ResponseEntity<>(standortDto, HttpStatus.NO_CONTENT);

    }

}
