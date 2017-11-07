package com.wagawin.person.business.service;

import com.wagawin.person.persistance.dao.ChildDAO;
import com.wagawin.person.persistance.dao.ParentSummaryDAO;
import com.wagawin.person.persistance.dao.PersonDAO;
import com.wagawin.person.persistance.entity.Child;
import com.wagawin.person.persistance.entity.House;
import com.wagawin.person.persistance.entity.ParentSummary;
import com.wagawin.person.persistance.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParentSummaryService {

    @Autowired
    private ParentSummaryDAO parentSummaryDAO;

    @Autowired
    private ChildDAO childDAO;


    public List<ParentSummary> findAll() {
        return parentSummaryDAO.findAll();
    }

    public void create() {
        List<Child> children = childDAO.findAll();
        Long amountOfPersons = children.stream().map(child -> child.getPerson()).distinct().count();
        parentSummaryDAO.save(new ParentSummary(amountOfPersons, Long.valueOf(children.size())));
    }


}
