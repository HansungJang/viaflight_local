package com.example.viaflight.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LayoverAirportRequest {

	private String layoverAirportName;
	private String layoverArrivalTime;
	private String layoverTime;

	public static Double layoverArrivalTimeToDouble(String layoverArrivalTime) {
		String[] parts = layoverArrivalTime.split(" : ");
		double hours = Double.parseDouble(parts[0]);
		double minutes = Double.parseDouble(parts[1]) / 60;
		double timeAsDouble = hours + minutes;
		return timeAsDouble;
	}


//	public LayoverAirportDto from(LayoverAirportRequest layoverAirportInput) {
//		return LayoverAirportDto.builder()
//				.layoverAirportName(layoverAirportInput.getLayoverAirportName())
//				.layoverArrivalTime(layoverAirportInput.getLayoverArrivalTime())
//				.layoverTime(layoverAirportInput.getLayoverTime())
//				.build();
//	}

}
