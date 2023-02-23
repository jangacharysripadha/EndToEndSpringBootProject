package com.chary.springboot.location.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.chary.springboot.location.model.Location;

public interface LocationRepository extends JpaRepository<Location,Integer>{



}
