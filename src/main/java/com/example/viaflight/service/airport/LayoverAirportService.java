package com.example.viaflight.service.airport;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.controller.response.LayoverAirportResponse;
import com.example.viaflight.domain.frameAboutDB.airport.LayoverAirportDBFrame;
import com.example.viaflight.domain.frameAboutDB.inLayoverAirport.AirportEventsDBFrame;
import com.example.viaflight.domain.frameAboutDB.inLayoverAirport.MealOptionsDBFrame;
import com.example.viaflight.domain.frameAboutDB.inLayoverAirport.RestsDBFrame;
import com.example.viaflight.domain.frameAboutDB.inLayoverAirport.ShoppingOptionsDBFrame;
import com.example.viaflight.dto.frameAboutDB.airportDto.LayoverAirportDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.AirportEventsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.RestsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.ShoppingOptionsDBFrameDto;
import com.example.viaflight.repository.frameAboutDB.airport.LayoverAirportDBFrameRepository;
import com.example.viaflight.service.inLayoverAirport.AirportEventsService;
import com.example.viaflight.service.inLayoverAirport.MealOptionsService;
import com.example.viaflight.service.inLayoverAirport.RestsService;
import com.example.viaflight.service.inLayoverAirport.ShoppingOptionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class LayoverAirportService {

	private final LayoverAirportDBFrameRepository layoverAirportDBFrameRepository;


	public LayoverAirportDBFrameDto load(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportId = layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1);

		LayoverAirportDBFrame layoverAirportDB = layoverAirportDBFrameRepository.findByLayoverAirportId(layoverAirportId).orElseThrow(NullPointerException::new);

		LayoverAirportDBFrameDto layoverAirportDBFrameDto = LayoverAirportDBFrameDto.from(layoverAirportDB);

		return layoverAirportDBFrameDto;
	}


}
