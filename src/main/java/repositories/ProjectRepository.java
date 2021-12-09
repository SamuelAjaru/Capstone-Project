package repositories;

import io.agileintelligence.ppmtool.domain.Project;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

	@Override
	default <S extends Project> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends Project> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Optional<Project> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	default Iterable<Project> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Iterable<Project> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	default void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void delete(Project entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAll(Iterable<? extends Project> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	

}
