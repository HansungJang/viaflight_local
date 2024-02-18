package com.example.viaflight.service.outLayoverAirport;

import com.example.viaflight.controller.request.LayoverAirportRequest;
import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.FreeTourDBFrame;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FreeTourDBFrameDto;
import com.example.viaflight.repository.frameAboutDB.outLayoverAirport.FreeTourDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FreeTourService {

	private final FreeTourDBFrameRepository freeTourDBFrameRepository;

	public List<FreeTourDBFrameDto> load(LayoverAirportRequest layoverAirportRequest) {
		List<FreeTourDBFrame> freeTourDBFrames = freeTourDBFrameRepository.findByLayoverAirportId(layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1));
		List<FreeTourDBFrameDto> freeTourDBFrameDtos = freeTourDBFrames.stream().map(FreeTourDBFrameDto::from).toList();

		return freeTourDBFrameDtos;
	}


}
