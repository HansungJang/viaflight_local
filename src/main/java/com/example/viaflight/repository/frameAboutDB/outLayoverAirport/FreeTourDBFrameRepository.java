package com.example.viaflight.repository.frameAboutDB.outLayoverAirport;

import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.FreeTourDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FreeTourDBFrameRepository extends JpaRepository<FreeTourDBFrame, Long> {
	List<FreeTourDBFrame> findByLayoverAirportId(String layoverAirportId);
}
