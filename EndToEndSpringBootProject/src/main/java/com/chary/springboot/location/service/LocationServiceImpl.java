package com.chary.springboot.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.chary.springboot.location.model.Location;
import com.chary.springboot.location.repositories.LocationRepository;

public class LocationServiceImpl implements LocationService {
    @Autowired
	 private LocationRepository repository;
	
	@Override
	public Location saveLocation(Location location) {
		
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
	
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);
		
	}

	@Override
	public Optional<Location> getLocationById(int id) {
		
		return repository.findById(id);
	}

	@Override
	public List<Location> getAllLocations() {
		
		return (List<Location>) repository.findAll();
	}
   
	public LocationRepository getRepository()
	{
		return repository;
	}
}
