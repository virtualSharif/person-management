package com.wagawin.person.config;

import com.wagawin.person.business.enums.HouseType;
import com.wagawin.person.persistance.dao.*;
import com.wagawin.person.persistance.entity.*;
import com.wagawin.person.scheduler.ParentSummaryScheduler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.util.Date;

@Configuration
public class StartUpDataConfig {

    private static final Logger log = LoggerFactory.getLogger(ParentSummaryScheduler.class);

    @Autowired
    private MealDAO mealDAO;

    @Autowired
    private HouseDAO houseDAO;

    @Autowired
    private PersonDAO personDAO;

    @Autowired
    private SonDAO sonDAO;

    @Autowired
    private DaughterDAO daughterDAO;

    @EventListener(ApplicationReadyEvent.class)
    public void populateDataAtStartup() {

        Person person1 = createPerson("Mark", 48);
        Person person2 = createPerson("Bob", 32);
        Person person3 = createPerson("Sam", 26);

        House house1 = createHouse("Hamburg", "29239", HouseType.HOUSE, person1);
        House house2 = createHouse("Berlin", "24229", HouseType.FLAT, person2);
        House house3 = createHouse("Stuttgart", "50221", HouseType.ESTATE, person3);

        Son sonChild1 = createSon(person3, "sonChild1", 43, "blue");
        Son sonChild2 = createSon(person3, "sonChild2", 12, "red");
        Son sonChild3 = createSon(person1, "sonChild3", 54, "green");

        Daughter daughterChild1 = createDaughter(person3, "daughterChild1", 23, "black");
        Daughter daughterChild2 = createDaughter(person3, "daughterChild2", 22, "brown");
        Daughter daughterChild3 = createDaughter(person1, "daughterChild3", 34, "grey");

        Meal meal1 = createMeal(sonChild1, "khajur");
        Meal meal2 = createMeal(sonChild2, "papad");
        Meal meal3 = createMeal(sonChild3, "kela");
        Meal meal4 = createMeal(daughterChild2, "falafal");
        Meal meal5 = createMeal(daughterChild2, "chicken burger");
        Meal meal6 = createMeal(daughterChild3, "veg burger");

        log.info("Startup data is populated into in memory database");

    }

    private Meal createMeal(Child child, String name) {
        return mealDAO.save(new Meal(name, new Date(), child));
    }

    private Daughter createDaughter(Person person, String name, Integer age, String hairColor) {
        return daughterDAO.save(new Daughter(name, age, person, hairColor));
    }

    private Son createSon(Person person, String name, Integer age, String bicycleColor) {
        return sonDAO.save(new Son(name, age, person, bicycleColor));
    }

    private Person createPerson(String name, Integer age) {
        return personDAO.save(new Person(name, age));
    }

    private House createHouse(String address, String zipCode, HouseType houseType, Person person) {
        return houseDAO.save(new House(address, zipCode, houseType, person));
    }



}
