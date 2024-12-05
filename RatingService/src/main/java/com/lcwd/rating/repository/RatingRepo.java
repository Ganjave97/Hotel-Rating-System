package com.lcwd.rating.repository;


import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.rating.entites.Rating;

public interface RatingRepo extends JpaRepository<Rating, String> {
	
	//custom finder methods
	
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);

}
