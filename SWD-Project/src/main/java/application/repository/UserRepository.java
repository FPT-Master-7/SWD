package application.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import application.entity.User;

public interface UserRepository extends CrudRepository<User, String>{

	Optional<User> findById(int id);
	Optional<User> deleteById(int id);
}
