package edu.jameslogan.video.Movies.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Entity ~ Table
@Table(name="persons")
public class Person { //Model - Domain Object - Value Object - DB Object
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "gender")
    private String gender;
 
    public Person() 
    {
    }
 
    public Person(Integer id, String firstName, String lastName, Date dob, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob=dob;
        this.gender=gender;
    }
 
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id=id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
   

}