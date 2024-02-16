package com.example.viaflight.repository.frameAboutDB.facilitiesAboutLayoverAirport;

import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.ShoppingOptionsDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShoppingOptionsDBFrameRepository extends JpaRepository<ShoppingOptionsDBFrame, Long> {
	Optional<List<ShoppingOptionsDBFrame>> findByLayoverAirportId(String layoverAirportId);
}
