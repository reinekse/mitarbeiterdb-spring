package com.example.mitarbeiterdb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.mitarbeiterdb.entity.PersonEntity;
@EnableJpaRepositories
@Repository
public interface PersonRepo extends JpaRepository<PersonEntity, Integer> {

}
