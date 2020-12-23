package com.company.service;


import com.company.dao.PersonDAO;
import com.company.model.Person;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    private PersonDAO personDAO;

    public Person save(Person person) {
        return personDAO.save(person);
    }

    public List<Person> getAll() {
        return personDAO.findAll();
    }

    public Person getUserById(int id) {
        return personDAO.findById(id).orElseThrow(NullPointerException::new);
    }

    public void delete(int id) {
        personDAO.deleteById(id);
    }
}
