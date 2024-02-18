package com.example.viaflight.repository.frameAboutDB.outLayoverAirport;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.domain.frameAboutDB.inLayoverAirport.ShoppingOptionsDBFrame;
import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.FoodSpotDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodSpotDBFrameRepository extends JpaRepository<FoodSpotDBFrame, Long> {

//	@Query(
//		"SELECT a FROM FoodSpotDBFrame a WHERE a.layoverAirportId = :layover_airport_id " +
//			"AND ((a.openTime <= :tour_arrival_time AND a.closeTime >= :tour_arrival_time) " +
//			"OR (a.closeTime > :tour_arrival_time AND a.openTime > a.closeTime))")
//	List<FoodSpotDBFrame> findOpenFoodSpot(@Param("layover_airport_id") String layoverAirportId, @Param("tour_arrival_time") double tourArrivalTime, @Param("able_tour_time") double ableTourTime);

	@Query("SELECT a FROM FoodSpotDBFrame a WHERE a.layoverAirportId = :layoverAirportId AND ((a.openTime <= :tourArrivalTime AND a.closeTime >= :tourArrivalTime) OR (a.closeTime > :tourArrivalTime AND a.openTime > a.closeTime))")
	List<FoodSpotDBFrame> findOpenFoodSpot(@Param("layoverAirportId") String layoverAirportId, @Param("tourArrivalTime") double tourArrivalTime);


//
//	static List<FoodSpotDBFrame> findOpenFoodSpot(LayoverAirportRequest layoverAirportRequest) {
//		return null;
//	}

}
