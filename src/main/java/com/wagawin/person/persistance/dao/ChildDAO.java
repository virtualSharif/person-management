package com.wagawin.person.persistance.dao;

import com.wagawin.person.persistance.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildDAO extends JpaRepository<Child, Integer> {
}
