package com.lcwd.hotel.services;

import java.util.List;

import com.lcwd.hotel.entites.Hotel;

public interface HotelService {
	
	//Create
	
	Hotel create(Hotel hotel);
	//getAll
	
	List<Hotel> getAll();
	
	//get Single
	Hotel get(String id);

}
