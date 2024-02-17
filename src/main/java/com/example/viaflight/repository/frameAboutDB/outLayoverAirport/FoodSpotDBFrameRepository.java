package com.example.viaflight.repository.frameAboutDB.outLayoverAirport;

import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.FoodSpotDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodSpotDBFrameRepository extends JpaRepository<FoodSpotDBFrame, Long> {
}
