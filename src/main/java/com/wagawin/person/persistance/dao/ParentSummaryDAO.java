package com.wagawin.person.persistance.dao;

import com.wagawin.person.persistance.entity.House;
import com.wagawin.person.persistance.entity.ParentSummary;
import com.wagawin.person.persistance.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParentSummaryDAO extends JpaRepository<ParentSummary, Integer> {
}
