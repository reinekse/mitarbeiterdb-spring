package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.PersonEntity;

@Repository
public interface IPersonRepo extends JpaRepository<PersonEntity, Integer> {

}
