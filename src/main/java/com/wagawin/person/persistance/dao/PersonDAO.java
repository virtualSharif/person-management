package com.wagawin.person.persistance.dao;

import com.wagawin.person.persistance.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDAO extends JpaRepository<Person, Integer> {
}
