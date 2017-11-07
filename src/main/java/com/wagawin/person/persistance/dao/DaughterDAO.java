package com.wagawin.person.persistance.dao;

import com.wagawin.person.persistance.entity.Daughter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaughterDAO extends JpaRepository<Daughter, Integer> {
}
