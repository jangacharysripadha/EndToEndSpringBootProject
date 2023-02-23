package com.chary.springboot.location.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chary.springboot.location.model.Location;
import com.chary.springboot.location.service.LocationService;


@Controller
public class LocationController {
    
	
   private LocationService locationService;
   
	
	public LocationService getLocationService() {
	return locationService;
}

public void setLocationService(LocationService locationService) {
	this.locationService = locationService;
}

	@RequestMapping("/showCreate") 
	public String showCreate()
	{
		return "creationLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location")Location location,ModelMap modelMap)
	{
	Location locationSaved=locationService.saveLocation(location);
	String msg="Location saved with id:"+locationSaved.getId();
	modelMap.addAttribute("msg",msg);
	return "createLocation";
	}
	
}	
	

