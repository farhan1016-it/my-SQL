package com.mindtree.restservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.mindtree.restservice.entity.Resturant;

//*@RepositoryRestResource(path = "/resturants")
@RestResource(exported = false)
public interface ResturantRepository extends JpaRepository<Resturant, String> {

}

