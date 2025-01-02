package com.ram.singh.rating.repository;

import com.ram.singh.rating.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, String> {

    // write the custom method here
    List<Rating> getRatingByHotelId(String hotelId);

    // write the custom method here
    List<Rating> getRatingByUserId(String userId);


}
