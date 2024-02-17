package com.example.viaflight.controller;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.controller.response.LayoverAirportResponse;
import com.example.viaflight.domain.frameAboutDB.airport.LayoverAirportDBFrame;
import com.example.viaflight.domain.frameAboutDB.inLayoverAirport.MealOptionsDBFrame;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight.repository.frameAboutDB.inLayoverAirport.MealOptionsDBFrameRepository;
import com.example.viaflight.service.airport.LayoverAirportService;
import com.example.viaflight.service.airport.ResponseService;
import com.example.viaflight.service.inLayoverAirport.MealOptionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LayoverAirportController {

	private final ResponseService responseService;

	@GetMapping("/layover-airport")
	public ResponseEntity<LayoverAirportResponse> getLayoverAirportInfo(@RequestBody LayoverAirportRequest layoverAirportRequest) {
		LayoverAirportResponse response = responseService.load(layoverAirportRequest);
		return ResponseEntity.ok().body(response);
	}

	// todo : 이 밑의 것은 test용이라 나중에 지워야함

	private final MealOptionsService mealOptionsService;
	@GetMapping("/layover-airport/test")
	public ResponseEntity<List<MealOptionsDBFrameDto>> getLayoverAirportInfoTest(@RequestBody LayoverAirportRequest layoverAirportRequest) {
		List<MealOptionsDBFrameDto> layoverAirportDBFrame = mealOptionsService.load(layoverAirportRequest);
		return ResponseEntity.ok().body(layoverAirportDBFrame);
	}


}
