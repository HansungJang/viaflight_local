package com.example.viaflight.controller;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.controller.response.LayoverAirportResponse;
import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.PaidActivityDBFrame;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.PaidActivityDBFrameDto;
import com.example.viaflight.service.ResponseService;
import com.example.viaflight.service.outLayoverAirport.PaidActivityService;
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


}
