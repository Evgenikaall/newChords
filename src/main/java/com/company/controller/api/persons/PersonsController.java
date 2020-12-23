package com.company.controller.api.persons;


import com.company.model.Person;
import com.company.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
@AllArgsConstructor
public class PersonsController {

    private PersonService personService;

    @GetMapping
    public List<Person> getAll(){
        return  personService.getAll();
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable int id){
        return personService.getUserById(id);
    }

    @PostMapping
    public void addPerson(@RequestBody Person person){
        personService.save(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        personService.delete(id);
    }

    @Secured({"ADMIN","MODERATOR"})
    @PutMapping
    public void update(@RequestBody Person person){
        personService.save(person);
    }



}
