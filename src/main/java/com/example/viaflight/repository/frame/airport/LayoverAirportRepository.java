package com.example.viaflight.repository.frame.airport;

import com.example.viaflight.domain.frame.airport.LayoverAirport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LayoverAirportRepository extends JpaRepository<LayoverAirport, Long> {
}
