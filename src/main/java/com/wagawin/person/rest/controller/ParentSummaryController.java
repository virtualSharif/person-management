package com.wagawin.person.rest.controller;

import com.wagawin.person.business.service.ParentSummaryService;
import com.wagawin.person.persistance.entity.ParentSummary;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "Parent Summary")
@RestController
@RequestMapping(value = "/api/v1")
public class ParentSummaryController {

    @Autowired
    private ParentSummaryService parentSummaryService;

    @GetMapping("/persons/children")
    public List<ParentSummary> findAll() {
        return parentSummaryService.findAll();
    }
}