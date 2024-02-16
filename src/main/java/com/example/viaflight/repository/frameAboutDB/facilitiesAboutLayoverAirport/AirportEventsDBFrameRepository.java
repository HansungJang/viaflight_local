package com.example.viaflight.repository.frameAboutDB.facilitiesAboutLayoverAirport;

import com.example.viaflight.domain.frameAboutDB.airport.LayoverAirportDBFrame;
import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.AirportEventsDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AirportEventsDBFrameRepository extends JpaRepository<AirportEventsDBFrame, Long>{
 	Optional<List<AirportEventsDBFrame>> findByLayoverAirportId(String layoverAirportId);


}
