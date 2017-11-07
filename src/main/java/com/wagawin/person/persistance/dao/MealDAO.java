package com.wagawin.person.persistance.dao;

import com.wagawin.person.persistance.entity.Child;
import com.wagawin.person.persistance.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealDAO extends JpaRepository<Meal, Integer> {
    List<Meal> findByChild(Child child);
}
