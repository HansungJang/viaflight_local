package com.example.viaflight.repository.frameAboutDB.airport;

import com.example.viaflight.domain.frameAboutDB.airport.LayoverAirportDBFrame;
import com.example.viaflight.dto.frameAboutDB.airportDto.LayoverAirportDBFrameDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public interface LayoverAirportDBFrameRepository extends JpaRepository<LayoverAirportDBFrame, Long>{
	Optional<LayoverAirportDBFrame> findByLayoverAirportId(String layoverAirportId);

}
