package com.chary.springboot.location.service;

import java.util.List;
import java.util.Optional;

import com.chary.springboot.location.model.Location;

public interface LocationService {
	public Location saveLocation(Location location);

	public Location updateLocation(Location location);

	public void deleteLocation(Location location);

	public Optional<Location> getLocationById(int id);

	public List<Location> getAllLocations();

}
