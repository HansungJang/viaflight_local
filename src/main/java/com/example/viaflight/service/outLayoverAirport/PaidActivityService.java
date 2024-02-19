package com.example.viaflight.service.outLayoverAirport;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.FreeTourDBFrame;
import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.PaidActivityDBFrame;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.PaidActivityDBFrameDto;
import com.example.viaflight.repository.frameAboutDB.outLayoverAirport.PaidActivityDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.DoubleBuffer;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PaidActivityService {
	private static final double MOVE_TIME_AIRPORT_TO_CITY = 2.0;
	private static final double Total_MOVE_TIME = 4.0;

	private final PaidActivityDBFrameRepository paidActivityDBFrameRepository;

	public List<PaidActivityDBFrameDto> load(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportId = layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1);
		double TourArrivalTime = LayoverAirportRequest.layoverArrivalTimeToDouble(layoverAirportRequest.getLayoverArrivalTime()) + MOVE_TIME_AIRPORT_TO_CITY;
		double ableTourTime = Double.parseDouble(layoverAirportRequest.getLayoverTime()) - Total_MOVE_TIME;


		List<PaidActivityDBFrame> paidActivityDBFrame = paidActivityDBFrameRepository.findByPaidActivity(layoverAirportId, TourArrivalTime, ableTourTime);
		List<PaidActivityDBFrameDto> paidActivityDBFrameDto = paidActivityDBFrame.stream().map(PaidActivityDBFrameDto::from).toList();

		return paidActivityDBFrameDto;
	}

}
