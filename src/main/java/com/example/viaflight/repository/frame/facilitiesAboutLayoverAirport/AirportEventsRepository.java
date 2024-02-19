package com.example.viaflight.repository.frame.facilitiesAboutLayoverAirport;

import com.example.viaflight.domain.frame.faciliteAboutLayoverAirport.AirportEvents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportEventsRepository extends JpaRepository<AirportEvents, Long>{

}
