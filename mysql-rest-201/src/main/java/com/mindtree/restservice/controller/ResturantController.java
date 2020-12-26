package com.mindtree.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.restservice.entity.Resturant;
import com.mindtree.restservice.repository.ResturantRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/resturants")
public class ResturantController {

	@Autowired
	private ResturantRepository repository;

	@PostMapping(consumes = "application/json")
	public Resturant create(@RequestBody Resturant resturant) {

		return repository.save(resturant);

	}

/*	@GetMapping(path = "/{resturantID}")
	public Resturant find(String resturantID) {
		 
		return repository.findOne(resturantID);

	}

	@PutMapping(path = "/{resturantID}")
	public Resturant update(String resturantID, @RequestBody Resturant resturant)
			throws BadHttpRequest {

		if (repository.exists(resturantID)) {

			resturant.setResturantID(resturantID);
			return repository.save(resturant);
		} else {
			throw new BadHttpRequest();

		}
	}*/

	@GetMapping
	public Iterable<Resturant> findAll() {
		return repository.findAll();

	}

	@RequestMapping(value = "delete/{resturantID}", method=RequestMethod.DELETE)
	public @ResponseBody void delete(@PathVariable("resturantID") String resturantID) {
        System.out.println("XXXXXXXXXXXXXXXXXXXIn Delete+:resturant IDXXXXXXXXXXXXXXX");
		repository.delete(resturantID);

	}

}