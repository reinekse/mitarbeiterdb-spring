package controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.PersonEntity;
import service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	private final PersonService service;

	public PersonController(PersonService service) {
		this.service = service;
	}

	@GetMapping("/all")
	public ResponseEntity<List<PersonEntity>> getAllPersonen() {
		List<PersonEntity> personen = service.findAllPersonen();
		return new ResponseEntity<>(personen, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<PersonEntity> getPersonById(@PathVariable("id") int id) {
		PersonEntity person = service.findPerson(id);
		return new ResponseEntity<>(person, HttpStatus.OK);

	}

	@PostMapping("/add")
	public ResponseEntity<PersonEntity> addPerson(@RequestBody PersonEntity person) {
		PersonEntity entity = service.addPerson(person);
		return new ResponseEntity<>(entity, HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<PersonEntity> deletePersonById(@PathVariable("id") int id) {
		PersonEntity person = service.deletePerson(id);
		return new ResponseEntity<>(person, HttpStatus.NO_CONTENT);

	}

}
