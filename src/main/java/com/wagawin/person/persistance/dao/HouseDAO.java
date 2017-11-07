package com.wagawin.person.persistance.dao;

import com.wagawin.person.persistance.entity.House;
import com.wagawin.person.persistance.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HouseDAO extends JpaRepository<House, Integer> {
    List<House> findByPerson(Person person);
}
