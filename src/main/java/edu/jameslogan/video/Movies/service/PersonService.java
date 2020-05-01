package edu.jameslogan.video.Movies.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jameslogan.video.Movies.model.Person;
import edu.jameslogan.video.Movies.repo.PersonRepo;


@Service
@Transactional
public class PersonService {

@Autowired
private PersonRepo personRepo;

public List<Person> findAll() 
{
    //List<Person> allPerson = new ArrayList<Person>();
    //allPerson = personRepo.findAll();
    //return allPerson;
    return personRepo.findAll();
}

public Person save( Person person)
{
    //person = personRepo.save(person);
    //return person;
    return personRepo.save(person);
}


public Person getPerson(Integer id)
{
    return personRepo.findById(id).get();
}


public void deletePerson(Person person)
{
    personRepo.delete(person);
}

public void deletePerson(Integer id) 
{
    personRepo.deleteById(id);
}


}