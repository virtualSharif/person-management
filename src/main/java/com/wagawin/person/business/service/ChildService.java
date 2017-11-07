package com.wagawin.person.business.service;

import com.wagawin.person.business.dto.ChildInfoDTO;
import com.wagawin.person.business.dto.StatusDTO;
import com.wagawin.person.persistance.dao.ChildDAO;
import com.wagawin.person.persistance.dao.HouseDAO;
import com.wagawin.person.persistance.dao.MealDAO;
import com.wagawin.person.persistance.dao.PersonDAO;
import com.wagawin.person.persistance.entity.*;
import com.wagawin.person.rest.exception.BadRequestException;
import com.wagawin.person.rest.exception.ErrorCodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService {

    @Autowired
    private ChildDAO childDAO;

    @Autowired
    private MealDAO mealDAO;

    public List<Child> findAll() {
        return childDAO.findAll();
    }

    public ChildInfoDTO findInfo(Integer id) {
        Child child = childDAO.findOne(id);
        validateChildExists(child);
        Meal meal = mealDAO.findByChild(child).get(0);
        return new ChildInfoDTO(child.getPerson(), meal);
    }

    public String findColor(Integer id) {
        Child child = childDAO.findOne(id);
        validateChildExists(child);
        if(child instanceof Son){
            Son son = (Son)child;
            return son.getBicycleColor();
        } else {
            Daughter daughter = (Daughter) child;
            return daughter.getHairColor();
        }
    }

    private void validateChildExists(Child child) {
        if (child == null) {
            throw new BadRequestException(new StatusDTO(ErrorCodes.CHILD_DOESNT_EXISTS));
        }
    }



}
