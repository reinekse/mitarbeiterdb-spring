package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import entity.StandortEntity;
import repo.IStandortRepo;

public class StandortService {
	@Autowired
	private IStandortRepo standortRepo;

	public StandortService(IStandortRepo standortRepo) {
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
