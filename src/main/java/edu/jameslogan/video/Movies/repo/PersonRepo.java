package edu.jameslogan.video.Movies.repo;
 
import org.springframework.data.jpa.repository.JpaRepository;
import edu.jameslogan.video.Movies.model.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {
 
}