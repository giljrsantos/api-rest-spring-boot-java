package br.com.br.firstapispringboot.controllers;


import br.com.br.firstapispringboot.PersonServices;
import br.com.br.firstapispringboot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import java.awt.*;
import java.util.logging.Logger;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service;

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Person> findAll(){
        return service.findAll();
    }

    @RequestMapping(value = "/{id}",
    method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person findById(@PathVariable("id") String id){
        return service.findById(id);
    }



    //private Logger logger = Logger.getLogger(PersonController.class.getName());

     //public PersonController(PersonServices service) {
       // this.service = service;
    //}

     // http://localhost:8080/person
     // return a list of people
     // create a new person
     // update a person
     // delete a person
}
