package com.game.Springbootlearning.Repository;

import com.game.Springbootlearning.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
  public List<Student> findByFirstName(String firstName);

    // public List<Student> findall();
    //  public Student findByFirstnameandLastname(String firstname,String lastname);
    static List<Student> findByFirstNameContaining(String character) {
        return null;
    }
}
