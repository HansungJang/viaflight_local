package com.example.viaflight.service.airport;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.domain.frameAboutDB.airport.LayoverAirportDBFrame;
import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.AirportEventsDBFrame;
import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.MealOptionsDBFrame;
import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.RestsDBFrame;
import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.ShoppingOptionsDBFrame;
import com.example.viaflight.dto.frame.airport.LayoverAirportDto;
import com.example.viaflight.repository.frame.airport.LayoverAirportRepository;
import com.example.viaflight.repository.frameAboutDB.airport.LayoverAirportDBFrameRepository;
import com.example.viaflight.repository.frameAboutDB.facilitiesAboutLayoverAirport.AirportEventsDBFrameRepository;
import com.example.viaflight.repository.frameAboutDB.facilitiesAboutLayoverAirport.MealOptionsDBFrameRepository;
import com.example.viaflight.repository.frameAboutDB.facilitiesAboutLayoverAirport.RestsDBFrameRepository;
import com.example.viaflight.repository.frameAboutDB.facilitiesAboutLayoverAirport.ShoppingOptionsDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class LayoverAirportService {

	private final LayoverAirportRepository layoverAirportRepository;
	private final LayoverAirportDBFrameRepository layoverAirportDBFrameRepository;
	private final AirportEventsDBFrameRepository airportEventsDBFrameRepository;
	private final MealOptionsDBFrameRepository mealOptionsDBFrameRepository;
	private final RestsDBFrameRepository restsDBFrameRepository;
	private final ShoppingOptionsDBFrameRepository shoppingOptionsDBFrameRepository;

//	public LayoverAirportDto save(LayoverAirportRequest layoverAirportRequest) {
	public List<ShoppingOptionsDBFrame> save(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportName = layoverAirportRequest.getLayoverAirportName();
		String layoverAirportId = layoverAirportName.substring(layoverAirportName.length()-4, layoverAirportName.length()-1);
		String arrivalTime = layoverAirportRequest.getLayoverArrivalTime();

		// todo : 각 data에서 SIN에 속하는 것들만 다 가져오기
		LayoverAirportDBFrame layoverAirportDB = layoverAirportDBFrameRepository.findByLayoverAirportId(layoverAirportId).orElseThrow(NullPointerException::new);
		List<AirportEventsDBFrame> airportEventsDB = airportEventsDBFrameRepository.findByLayoverAirportId(layoverAirportId).orElseThrow(NullPointerException::new);
//		List<MealOptionsDBFrame> mealOptionsDB = mealOptionsDBFrameRepository.findByLayoverAirportId(layoverAirportId).orElseThrow(NullPointerException::new);

//		List<MealOptionsDBFrame> mealOptionsDB = mealOptionsDBFrameRepository.findByLayoverAirportIdAndArrivalTimeGreaterThanAndArrivalTimeLessThan(layoverAirportId, openTime, ).orElseThrow(NullPointerException::new);

		List<RestsDBFrame> restsDB = restsDBFrameRepository.findByLayoverAirportId(layoverAirportId).orElseThrow(NullPointerException::new);
		List<ShoppingOptionsDBFrame> shoppingOptionsDB = shoppingOptionsDBFrameRepository.findByLayoverAirportId(layoverAirportId).orElseThrow(NullPointerException::new);

		// todo : 가져온 DataList 중, 내가 도착한 시간에 열려있는 것만 가져오기


		return shoppingOptionsDB;

	}


}
