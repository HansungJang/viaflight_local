package com.example.viaflight.dto.frame.airport;

import com.example.viaflight.domain.frame.airport.LayoverAirport;
import com.example.viaflight.dto.frameAboutDB.airportDto.LayoverAirportDBFrameDto;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LayoverAirportDto {

	private String layoverAirportId;
	private String layoverAirportName;
	private String layoverArrivalTime;
	private String layoverTime;
	private String wifi;
	private String smokingArea;
	private String showerFacilities;
	private String pharmacy;
	private String currencyExchange;
	private String luggageStorage;
	private String informationCenter;

	public LayoverAirportDto from(LayoverAirport layoverAirport) {
		return LayoverAirportDto.builder()
				.layoverAirportId(layoverAirport.getLayoverAirportId())
				.layoverAirportName(layoverAirport.getLayoverAirportName())
				.layoverArrivalTime(layoverAirport.getLayoverArrivalTime())
				.layoverTime(layoverAirport.getLayoverTime())
				.wifi(layoverAirport.getWifi())
				.smokingArea(layoverAirport.getSmokingArea())
				.showerFacilities(layoverAirport.getShowerFacilities())
				.pharmacy(layoverAirport.getPharmacy())
				.currencyExchange(layoverAirport.getCurrencyExchange())
				.luggageStorage(layoverAirport.getLuggageStorage())
				.informationCenter(layoverAirport.getInformationCenter())
				.build();
	}

	public LayoverAirportDto from(LayoverAirportDBFrameDto layoverAirportDBFrameDto){
		return LayoverAirportDto.builder()
				.layoverAirportId(layoverAirportDBFrameDto.getLayoverAirportId())
				.layoverAirportName(layoverAirportDBFrameDto.getLayoverAirportName())
				.wifi(layoverAirportDBFrameDto.getWifi())
				.smokingArea(layoverAirportDBFrameDto.getSmokingArea())
				.showerFacilities(layoverAirportDBFrameDto.getShowerFacilities())
				.pharmacy(layoverAirportDBFrameDto.getPharmacy())
				.currencyExchange(layoverAirportDBFrameDto.getCurrencyExchange())
				.luggageStorage(layoverAirportDBFrameDto.getLuggageStorage())
				.informationCenter(layoverAirportDBFrameDto.getInformationCenter())
				.build();
	}

}
