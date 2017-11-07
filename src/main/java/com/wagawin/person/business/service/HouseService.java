package com.wagawin.person.business.service;

import com.wagawin.person.business.dto.StatusDTO;
import com.wagawin.person.persistance.dao.ChildDAO;
import com.wagawin.person.persistance.dao.HouseDAO;
import com.wagawin.person.persistance.dao.PersonDAO;
import com.wagawin.person.persistance.entity.House;
import com.wagawin.person.persistance.entity.Person;
import com.wagawin.person.rest.exception.BadRequestException;
import com.wagawin.person.rest.exception.ErrorCodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {

    @Autowired
    private HouseDAO houseDAO;

    @Autowired
    private PersonDAO personDAO;

    public List<House> findAll(Integer personId) {
        Person person = personDAO.findOne(personId);
        validatePersonExists(person);
        return houseDAO.findByPerson(person);
    }

    public House save(Integer personId, House house) {
        Person person = personDAO.findOne(personId);
        validatePersonExists(person);
        return houseDAO.save(house);
    }

    public void delete(Integer personId, Integer id) {
        Person person = personDAO.findOne(personId);
        validatePersonExists(person);
        House house = houseDAO.findOne(id);
        if (house != null) {
            houseDAO.delete(house);
        }
    }

    private void validatePersonExists(Person person) {
        if (person == null) {
            throw new BadRequestException(new StatusDTO(ErrorCodes.PERSON_DOESNT_EXISTS));
        }
    }


}
