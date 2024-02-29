package com.example.mitarbeiterdb;

import com.example.mitarbeiterdb.repo.StandortRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.mitarbeiterdb.repo.PersonRepo;

@SpringBootApplication
public class MitarbeiterdbApplication{


	public static void main(String[] args) {
		SpringApplication.run(MitarbeiterdbApplication.class, args);
	}

	@Bean
	CommandLineRunner init(PersonRepo personRepo, StandortRepo standortRepo) {
		return args -> {

			personRepo.findAll().forEach(System.out::println);
			standortRepo.findAll().forEach(System.out::println);
		};
	}
}
