package com.lcwd.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.hotel.entites.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String> {
    // Custom query methods (if needed)
}
