package br.com.br.firstapispringboot.services;

import br.com.br.firstapispringboot.model.Person;
import br.com.br.firstapispringboot.repository.PersonRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.slf4j.Logger;

@Service
public class PersonServices {

    private  final AtomicLong counter = new AtomicLong();
    private Logger logger = LoggerFactory.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;


    public List<Person> findAll(){
        logger.info("Finding All people!");

        return repository.findAll();

    }


    public Person findById(Long id){
        logger.info("Finding one Person!");

        return repository.findById(id).orElseThrow(() -> new RuntimeException("No records found for this ID!"));
    }

    public Person create(Person person){
        logger.info("Creating one Person!");
        return repository.save(person);
    }

    public Person update(Person person){
        logger.info("Updating one Person!");
        Person entity = repository.findById(person.getId()).orElseThrow(() -> new RuntimeException("Person not found"));
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        return repository.save(person);
    }

    public void delete(Long id){
        logger.info("Deleting one Person!");
        Person entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Person not found"));
        repository.delete(entity);
    }


}
