package br.com.br.firstapispringboot.repository;

import br.com.br.firstapispringboot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
