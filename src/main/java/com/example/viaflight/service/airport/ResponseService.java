package com.example.viaflight.service.airport;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.controller.response.LayoverAirportResponse;
import com.example.viaflight.dto.frameAboutDB.airportDto.LayoverAirportDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.AirportEventsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.RestsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.ShoppingOptionsDBFrameDto;
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
public class ResponseService {

	private final LayoverAirportService layoverAirportService;
	private final AirportEventsService airportEventsService;
	private final MealOptionsService mealOptionsService;
	private final RestsService restsService;
	private final ShoppingOptionsService shoppingOptionsService;

	public LayoverAirportResponse load(LayoverAirportRequest layoverAirportRequest) {

		LayoverAirportDBFrameDto layoverAirportDBFrameDto = layoverAirportService.load(layoverAirportRequest);
		List<AirportEventsDBFrameDto> airportEventsDBFrameDtoList = airportEventsService.load(layoverAirportRequest);
		List<MealOptionsDBFrameDto> mealOptionsDBFrameDtoList = mealOptionsService.load(layoverAirportRequest);
		List<RestsDBFrameDto> restsDBFrameDtoList = restsService.load(layoverAirportRequest);
		List<ShoppingOptionsDBFrameDto> shoppingOptionsDBFrameDtoList = shoppingOptionsService.load(layoverAirportRequest);

		return new LayoverAirportResponse(layoverAirportDBFrameDto, airportEventsDBFrameDtoList, mealOptionsDBFrameDtoList, restsDBFrameDtoList, shoppingOptionsDBFrameDtoList);

	}
}
