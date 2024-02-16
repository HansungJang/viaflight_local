package com.example.viaflight.service.airport;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.dto.frame.airport.LayoverAirportDto;
import com.example.viaflight.repository.frame.airport.LayoverAirportRepository;
import com.example.viaflight.repository.frameAboutDB.airport.LayoverAirportDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class LayoverAirportService {

	private final LayoverAirportRepository layoverAirportRepository;
	private final LayoverAirportDBFrameRepository layoverAirportDBFrameRepository;

	public LayoverAirportDto save(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportName = layoverAirportRequest.getLayoverAirportName();
		String layoverAirportId = layoverAirportName.substring(layoverAirportName.length()-4, layoverAirportName.length()-1);
//		layoverAirportRequest.setLayoverAirportId(layoverAirportId);
//		layoverAirportRepository.save(LayoverAirport.from(layoverAirportDto));
//		return layoverAirportRequest;
		return null;
	}


}
