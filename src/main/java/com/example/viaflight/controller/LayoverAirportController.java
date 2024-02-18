package com.example.viaflight.controller;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.controller.response.LayoverAirportResponse;
import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.FoodSpotDBFrame;
import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.PaidActivityDBFrame;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FoodSpotDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FreeTourDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.PaidActivityDBFrameDto;
import com.example.viaflight.service.ResponseService;
import com.example.viaflight.service.inLayoverAirport.MealOptionsService;
import com.example.viaflight.service.outLayoverAirport.FoodSpotService;
import com.example.viaflight.service.outLayoverAirport.FreeTourService;
import com.example.viaflight.service.outLayoverAirport.OUTSERVICE;
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

	// todo : 이 밑의 것은 test용이라 나중에 지워야함

	private final MealOptionsService mealOptionsService;
	@GetMapping("/layover-airport/testin")
	public ResponseEntity<List<MealOptionsDBFrameDto>> getLayoverAirportInfoTest(@RequestBody LayoverAirportRequest layoverAirportRequest) {
		List<MealOptionsDBFrameDto> layoverAirportDBFrame = mealOptionsService.load(layoverAirportRequest);
		return ResponseEntity.ok().body(layoverAirportDBFrame);
	}

	// todo : 외부 tour 관련 api test용. -> 일단 여기서 하고, 나중에 responseService로 옮겨줘야함.
	private final PaidActivityService paidActivityService;

	@GetMapping("/layover-airport/testout3")
	public ResponseEntity<List<PaidActivityDBFrameDto>> getLayoverAirportInfoTestOut3(@RequestBody LayoverAirportRequest layoverAirportRequest) {
		List<PaidActivityDBFrameDto> layoverAirportDBFrame = paidActivityService.load(layoverAirportRequest);
		return ResponseEntity.ok().body(layoverAirportDBFrame);
	}
//	@GetMapping("/layover-airport/testout")
//	public ResponseEntity<List<OUTSERVICE>> getLayoverAirportInfoTestOut(@RequestBody LayoverAirportRequest layoverAirportRequest) {
////		List<OUTSERVICE> layoverAirportDBFrame = outservice.load(layoverAirportRequest);
//		List<OUTSERVICE> layoverAirportDBFrame = outservice.load(layoverAirportRequest);
//		return ResponseEntity.ok().body(layoverAirportDBFrame);
//	}



}
