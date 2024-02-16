package com.example.viaflight.repository.frameAboutDB.facilitiesAboutLayoverAirport;

import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.RestsDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestsDBFrameRepository extends JpaRepository<RestsDBFrame, Long> {
	Optional<List<RestsDBFrame>> findByLayoverAirportId(String layoverAirportId);
}
