package br.com.jmccursos.tecnologia.mudijesse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jmccursos.tecnologia.mudijesse.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	User findByUsername(String username);

}
