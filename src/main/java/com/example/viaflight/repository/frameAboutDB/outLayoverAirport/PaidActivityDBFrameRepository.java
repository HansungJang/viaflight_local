package com.example.viaflight.repository.frameAboutDB.outLayoverAirport;

import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.PaidActivityDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaidActivityDBFrameRepository extends JpaRepository<PaidActivityDBFrame, Long> {
}
