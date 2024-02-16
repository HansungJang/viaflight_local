package com.example.viaflight.controller.request;

import com.example.viaflight.dto.frame.airport.LayoverAirportDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class LayoverAirportRequest {

	private String layoverAirportName;
	private String layoverArrivalTime;
	private String layoverTime;

//	public LayoverAirportDto from(LayoverAirportRequest layoverAirportInput) {
//		return LayoverAirportDto.builder()
//				.layoverAirportName(layoverAirportInput.getLayoverAirportName())
//				.layoverArrivalTime(layoverAirportInput.getLayoverArrivalTime())
//				.layoverTime(layoverAirportInput.getLayoverTime())
//				.build();
//	}

}
