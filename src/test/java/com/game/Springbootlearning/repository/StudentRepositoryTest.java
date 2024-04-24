package com.game.Springbootlearning.repository;



import com.game.Springbootlearning.Repository.StudentRepository;
//import com.game.Springbootlearning.entities.Guardian;
import com.game.Springbootlearning.entities.Guardian;
import com.game.Springbootlearning.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
//@DataJpaTest
@SpringBootTest
public class StudentRepositoryTest {
    @Autowired
   private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student= Student.builder()
                .firstName("Akshay")
                .lastName("Chincholkar")
                .emailId("Akshay.chincholkar@gmail.com")
                 /*.guardianName("Darshana")
                 .guardianEmail("darshana.patil@gmail.com")
                 .guardianContactNumber("7620524242")*/
                .build();

    studentRepository.save(student);
   }

   @Test
   public void saveStudentWithGuardian(){
       Guardian guardian= Guardian.builder()
               .Name("Darshana")
               .Email("darshana.patil@gmail.com")
               .ContactNumber("7620524242")
               .build();

      Student student= Student.builder()
              .firstName("Priya")
              .lastName("Patil")
              .emailId("priya.patil@gmail.com")
               .guardian(guardian)
              .build();

       studentRepository.save(student);
   }

   @Test
  public void printAllStudent(){
        List<Student> studentList=studentRepository.findAll();
        System.out.println(studentList);
    }

    @Test
    public void findByFirstNameContaining(String charecter)
    {
        List<Student> student=StudentRepository.findByFirstNameContaining("sh");
    }
//    @Test
//    public void printStudentByFirstnameandLastname(){
//      //  Student student=studentRepository.findByFirstnameandLastname("Darshana","Patil");
//       // System.out.println(student);
//    }

}
