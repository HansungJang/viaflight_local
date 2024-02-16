package com.example.viaflight.repository.frameAboutDB.facilitiesAboutLayoverAirport;

import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.ShoppingOptionsDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingOptionsDBFrameRepository extends JpaRepository<ShoppingOptionsDBFrame, Long> {
}
