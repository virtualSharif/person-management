package com.wagawin.person.rest.controller;

import com.wagawin.person.business.service.HouseService;
import com.wagawin.person.persistance.entity.House;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "House")
@RestController
@RequestMapping(value = "/api/v1/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @GetMapping
    public List<House> findAll(@RequestParam Integer personId) {
        return houseService.findAll(personId);
    }

}