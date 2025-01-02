package com.ram.singh.rating.service;

import com.ram.singh.rating.entities.Rating;

import java.util.List;

public interface RatingService {
    Rating createRating(Rating rating);
    List<Rating> getAllRating();
    List<Rating> getRatingByHotelId(String hotelId);
    List<Rating> getRatingByUserId(String userId);

}
