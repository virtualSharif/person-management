package com.wagawin.person.rest.controller;

import com.wagawin.person.business.dto.ChildInfoDTO;
import com.wagawin.person.business.service.ChildService;
import com.wagawin.person.persistance.entity.Child;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "Child")
@RestController
@RequestMapping(value = "/api/v1/child")
public class ChildController {

	@Autowired
	private ChildService childService;

	@GetMapping
	public List<Child> findAll() {
        return childService.findAll();
	}

	@GetMapping("/info")
	public ChildInfoDTO findInfo(@RequestParam Integer id) {
		return childService.findInfo(id);
	}

	@GetMapping("/color")
	public String findColor(@RequestParam Integer id) {
		return childService.findColor(id);
	}
}