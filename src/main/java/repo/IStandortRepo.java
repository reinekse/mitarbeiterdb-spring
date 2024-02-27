package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.StandortEntity;

@Repository
public interface IStandortRepo extends JpaRepository<StandortEntity, Integer> {

}
