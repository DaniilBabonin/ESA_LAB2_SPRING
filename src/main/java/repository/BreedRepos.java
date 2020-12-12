package repository;

import entity.Breed;
import org.springframework.data.repository.CrudRepository;

public interface BreedRepos extends CrudRepository <Breed, Long> {

}
