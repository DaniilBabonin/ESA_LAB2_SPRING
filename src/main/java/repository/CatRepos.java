package repository;

import entity.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatRepos extends CrudRepository <Cat, Long> {

}
