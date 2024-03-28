package dev.rainbow.jpapaging.repository;

import dev.rainbow.jpapaging.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface PersonRepository extends PagingAndSortingRepository<Person,Integer> {
    List<Person> saveAll(Iterable<Person> people);
}
