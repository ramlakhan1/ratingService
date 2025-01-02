package com.ram.singh.rating.service.impl;

import com.ram.singh.rating.entities.Rating;
import com.ram.singh.rating.repository.RatingRepository;
import com.ram.singh.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    /**
     * @param rating
     * @return
     */
    @Override
    public Rating createRating(Rating rating) {
        String id = UUID.randomUUID().toString();
        rating.setRatingId(id);
        return ratingRepository.save(rating);
    }

    /**
     * @return
     */
    @Override
    public List<Rating> getAllRating() {
        return ratingRepository.findAll();
    }

    /**
     * @param hotelId
     * @return
     */
    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.getRatingByHotelId(hotelId);
    }

    /**
     * @param userId
     * @return
     */
    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.getRatingByUserId(userId);
    }
}
