package com.example.mitarbeiterdb.repo;

import com.example.mitarbeiterdb.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface PersonRepo extends JpaRepository<PersonEntity, Integer> {

}
