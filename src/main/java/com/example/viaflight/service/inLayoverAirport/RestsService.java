package com.example.viaflight.service.inLayoverAirport;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.domain.frameAboutDB.inLayoverAirport.RestsDBFrame;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.RestsDBFrameDto;
import com.example.viaflight.repository.frameAboutDB.inLayoverAirport.RestsDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class RestsService {

	private final RestsDBFrameRepository restsDBFrameRepository;

	public List<RestsDBFrameDto> load(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportId = layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1);
		Double layoverArrivalTime = LayoverAirportRequest.layoverArrivalTimeToDouble(layoverAirportRequest.getLayoverArrivalTime());
		List<RestsDBFrameDto> mealOptionsDBFrameDtoList = restsDBFrameRepository.findOpenPlaces(layoverAirportId, layoverArrivalTime).stream().map(RestsDBFrameDto::from).toList();

		return mealOptionsDBFrameDtoList;
	}

}
