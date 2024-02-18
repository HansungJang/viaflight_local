package com.example.viaflight.service.outLayoverAirport;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.FoodSpotDBFrame;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FoodSpotDBFrameDto;
import com.example.viaflight.repository.frameAboutDB.outLayoverAirport.FoodSpotDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FoodSpotService {

	private final FoodSpotDBFrameRepository foodSpotDBFrameRepository;

	public List<FoodSpotDBFrameDto> load(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportId = layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1);
		double TourArrivalTime = LayoverAirportRequest.layoverArrivalTimeToDouble(layoverAirportRequest.getLayoverArrivalTime());

		List<FoodSpotDBFrame> foodSpotDBFrames = foodSpotDBFrameRepository.findOpenFoodSpot(layoverAirportId, TourArrivalTime);
		List<FoodSpotDBFrameDto> foodSpotDBFrameDtos = foodSpotDBFrames.stream().map(FoodSpotDBFrameDto::from).toList();

		return foodSpotDBFrameDtos;

	}

}
