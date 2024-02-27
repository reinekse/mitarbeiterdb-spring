package com.example.mitarbeiterdbSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MitarbeiterdbSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(MitarbeiterdbSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello world");
//		this.standortRepo.save(new StandortEntity("Lindenallee", "17-19", "24288", "Duppelbach"));
//		this.standortRepo.save(new StandortEntity("Elisabethweg", "8", "24288", "Duppelbach"));
//		this.standortRepo.save(new StandortEntity("Im Weißmoor", "27a", "24117", "Ludwigsfehn"));

	}

}

//"INSERT INTO personen (" + personenColumns + ") VALUES"
//+ "('Mönkeberg', 'Petra', '1967-03-17', 'E1', 1, '2019-02-01'), "
//+ "('Hildebrandt', 'Louis', '1997-04-12', 'E1', 1, '2020-04-01'), "
//+ "('Kowalski', 'Benedikt', '1972-01-13', 'E2', 1, '2010-05-01'), "
//+ "('Mahd-Lehmann', 'Claudia', '1969-03-18', 'E2', 1, '2012-03-01'), "
//+ "('Saleh', 'Muhammad', '1987-03-01', 'E2', 1, '2021-03-01'), "
//+ "('Petersen', 'Petra', '1971-12-07', 'A1', 2, '2005-08-01'), "
//+ "('Kulik', 'Nikita', '1992-05-01', 'A2', 2, '2019-02-01'), "
//+ "('Hermann', 'Michelle', '1989-08-05', 'A4', 2, '2015-07-01'), "
//+ "('Nguyen', 'Sarah', '2001-10-17', 'A1', 2, '2020-08-01'), "
//+ "('Pilatzki', 'Tomasz', '1974-03-31', 'E2', 1, '2017-11-01'), "
//+ "('Michaelis', 'Ronald', '1972-07-12', 'E1', 1, '2009-02-01'), "
//+ "('Leew', 'Mareike', '1987-04-22', 'A1', 1, '2015-08-01'), "
//+ "('Schnieders', 'Martin', '1981-09-11', 'C1', 3, '2023-05-01'), "
//+ "('Meyer-Friedrichsen', 'Julian', '1990-06-18', 'A2', 1, '2022-10-01')" + ";";
