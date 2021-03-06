package com.cloud.springfluxproject.controller;

import com.cloud.springfluxproject.domain.Person;
import com.cloud.springfluxproject.repository.PersonRepository;
import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author bshao
 */
@RestController
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

//    @PostMapping("person")
//    Mono<Void> create(@RequestBody Publisher<Person> personStream) {
//        return this.repository.save(personStream).then();
//    }
}
