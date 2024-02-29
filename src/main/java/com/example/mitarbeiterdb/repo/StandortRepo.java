package com.example.mitarbeiterdb.repo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mitarbeiterdb.entity.StandortEntity;
import org.springframework.stereotype.Repository;

@Repository
@EnableAutoConfiguration
public interface StandortRepo extends JpaRepository<StandortEntity, Integer> {

}
