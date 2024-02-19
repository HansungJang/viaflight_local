package com.example.viaflight.service.inLayoverAirport;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.domain.frameAboutDB.inLayoverAirport.AirportEventsDBFrame;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.AirportEventsDBFrameDto;
import com.example.viaflight.repository.frameAboutDB.inLayoverAirport.AirportEventsDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AirportEventsService {

	private final AirportEventsDBFrameRepository airportEventsDBFrameRepository;

	public List<AirportEventsDBFrameDto> load(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportId = layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1);
		Double layoverArrivalTime = LayoverAirportRequest.layoverArrivalTimeToDouble(layoverAirportRequest.getLayoverArrivalTime());
		List<AirportEventsDBFrameDto> airportEventsDBFrameDtoListDDD = airportEventsDBFrameRepository.findOpenPlaces(layoverAirportId, layoverArrivalTime).stream().map(AirportEventsDBFrameDto::from).toList();

		return airportEventsDBFrameDtoListDDD;
	}

}
