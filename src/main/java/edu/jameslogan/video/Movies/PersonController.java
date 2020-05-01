package edu.jameslogan.video.Movies;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.jameslogan.video.Movies.model.Person;
import edu.jameslogan.video.Movies.service.PersonService;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    /*
    xml
        <firstname>James</firstname>
    json
        {firstname:"James",dob:19}

    insert:
    request -> dispatcher -> controller (model) -> Services (model) -> repo(s) (model)
    response <- dispatcher <- controller <- Services <- repo(s) (model)


    */
    @GetMapping("/persons")
    public List<Person> findAllPerson()
    {
        return personService.findAll();
    }

    @PostMapping("/saveperson")
    public Person savePerson(@RequestBody Person person)
    //public Person savePerson()
    {
        //long millis=System.currentTimeMillis();  
        //java.sql.Date date=new java.sql.Date(millis);  
        //Person p = new Person(null, "Aron","Patel",date, "M");
        //return personService.save(p);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getDob());
        System.out.println(person.getGender());

        return personService.save(person);
    }


    @GetMapping("/getperson/{id}")
    public Person gettingPerson(@PathVariable Integer id)
    {
        return personService.getPerson(id);
    }

    //@PostMapping("/deleteperson")
    public void deletingPerson(Person person)
    {
        personService.deletePerson(person);
    }

    
    //@GetMapping("/deleteperson/{id}")
    @DeleteMapping("/deleteperson/{id}")
    public void deletePerson(@PathVariable Integer id) 
    {
        personService.deletePerson(id);
    }

}