package com.example.viaflight.service.inLayoverAirport;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.domain.frameAboutDB.inLayoverAirport.ShoppingOptionsDBFrame;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.RestsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.ShoppingOptionsDBFrameDto;
import com.example.viaflight.repository.frameAboutDB.inLayoverAirport.ShoppingOptionsDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ShoppingOptionsService {

	private final ShoppingOptionsDBFrameRepository shoppingOptionsDBFrameRepository;

	public List<ShoppingOptionsDBFrameDto> load(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportId = layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1);
		Double layoverArrivalTime = LayoverAirportRequest.layoverArrivalTimeToDouble(layoverAirportRequest.getLayoverArrivalTime());
		List<ShoppingOptionsDBFrameDto> mealOptionsDBFrameDtoList = shoppingOptionsDBFrameRepository.findOpenPlaces(layoverAirportId, layoverArrivalTime).stream().map(ShoppingOptionsDBFrameDto::from).toList();

		return mealOptionsDBFrameDtoList;
	}

}
