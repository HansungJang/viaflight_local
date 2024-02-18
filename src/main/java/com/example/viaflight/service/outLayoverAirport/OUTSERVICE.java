package com.example.viaflight.service.outLayoverAirport;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.FoodSpotDBFrame;
import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.PaidActivityDBFrame;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FoodSpotDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FreeTourDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.PaidActivityDBFrameDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class OUTSERVICE {

	// 이건 OUT TEST용이다. 따라서 이 파일은 이후에 삭제한다.
	private final FoodSpotService foodSpotService;
	private final FreeTourService freeTourService;
	private final PaidActivityService paidActivityService;

	List<FoodSpotDBFrameDto> firstDB;
	List<FreeTourDBFrameDto> secondDB;
	List<PaidActivityDBFrameDto> thirdDB;


	public List<FoodSpotDBFrameDto> load(LayoverAirportRequest layoverAirportRequest) {

		List<FoodSpotDBFrameDto> firstDB = foodSpotService.load(layoverAirportRequest);
		List<FreeTourDBFrameDto> secondDB = freeTourService.load(layoverAirportRequest);
		List<PaidActivityDBFrameDto> thirdDB = paidActivityService.load(layoverAirportRequest);

		return firstDB;

	}



}
