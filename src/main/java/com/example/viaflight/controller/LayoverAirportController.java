package com.example.viaflight.controller;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.AirportEventsDBFrame;
import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.MealOptionsDBFrame;
import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.RestsDBFrame;
import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.ShoppingOptionsDBFrame;
import com.example.viaflight.dto.frame.airport.LayoverAirportDto;
import com.example.viaflight.service.airport.LayoverAirportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LayoverAirportController {

	private final LayoverAirportService layoverAirportService;

	@GetMapping("/layover-airport")
//	public ResponseEntity<LayoverAirportDto> getLayoverAirportInfo(@RequestBody LayoverAirportRequest layoverAirportRequest) {
	public ResponseEntity<List<ShoppingOptionsDBFrame>> getLayoverAirportInfo(@RequestBody LayoverAirportRequest layoverAirportRequest) {
//		LayoverAirportDto response = layoverAirportService.save(layoverAirportRequest);
		List<ShoppingOptionsDBFrame> response = layoverAirportService.save(layoverAirportRequest);
		return ResponseEntity.ok().body(response);
//		return null;
	}



}
