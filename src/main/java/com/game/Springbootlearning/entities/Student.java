package com.game.Springbootlearning.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Student_tbl")
public class Student {

    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName ="student_sequence",
            allocationSize =1//allocationsize increment by 2
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "student_sequence")
    private long studentId;
    private String firstName;
    private String lastName;
    @Column(name="email_address",nullable = false)
    private String emailId;
   @Embedded
    private  Guardian guardian;
 /*  private String guardianName;
    private String guardianEmail;
    private String guardianContactNumber;*/

}
