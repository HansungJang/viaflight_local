package com.example.viaflight.repository.frameAboutDB.facilitiesAboutLayoverAirport;

import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.MealOptionsDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MealOptionsDBFrameRepository extends JpaRepository<MealOptionsDBFrame, Long> {
	Optional<List<MealOptionsDBFrame>> findByLayoverAirportId(String layoverAirportId);
	Optional<List<MealOptionsDBFrame>>findByLayoverAirportIdAndTimeGreaterThanAndTimeLessThan(String layoverAirportId, String openTime, String closeTime);
}
