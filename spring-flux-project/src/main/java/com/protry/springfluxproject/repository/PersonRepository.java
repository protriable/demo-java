package com.protry.springfluxproject.repository;

import com.protry.springfluxproject.domain.Person;
import org.reactivestreams.Publisher;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * @author bshao
 */
//@RepositoryDefinition(domainClass = Person.class, idClass = Integer.class)
public interface PersonRepository extends Repository<Person, Integer> {
}
