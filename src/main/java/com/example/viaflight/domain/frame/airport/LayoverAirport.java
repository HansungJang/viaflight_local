package com.example.viaflight.domain.frame.airport;

import com.example.viaflight.dto.frame.airport.LayoverAirportDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LayoverAirport {
	
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;

	@Column(name = "layover_airport_id", nullable = false)
	private String layoverAirportId;

	@Column(name = "layober_airport_name", nullable = false)
	private String layoverAirportName;

	@Column(name = "layover_arrival_time",nullable = false, length = 1000)
	private String layoverArrivalTime;

	@Column(name = "layover_time", nullable = false)
	private String layoverTime;




	// 밑의 것은 이후에 생각하기.

	@Column(nullable = true, length = 1000)
	private String wifi;

	@Column(nullable = true, length = 1000)
	private String smokingArea;

	@Column(nullable = true, length = 1000)
	private String showerFacilities;

	@Column(nullable = true, length = 1000)
	private String pharmacy;

	@Column(nullable = true, length = 1000)
	private String currencyExchange;

	@Column(nullable = true, length = 1000)
	private String luggageStorage;

	@Column(nullable = true, length = 1000)
	private String informationCenter;

	public LayoverAirport from(LayoverAirportDto layoverAirportDto) {
		return LayoverAirport.builder()
			.layoverAirportId(layoverAirportDto.getLayoverAirportId())
			.layoverAirportName(layoverAirportDto.getLayoverAirportName())
			.layoverArrivalTime(layoverAirportDto.getLayoverArrivalTime())
			.layoverTime(layoverAirportDto.getLayoverTime())
			.wifi(layoverAirportDto.getWifi())
			.smokingArea(layoverAirportDto.getSmokingArea())
			.showerFacilities(layoverAirportDto.getShowerFacilities())
			.pharmacy(layoverAirportDto.getPharmacy())
			.currencyExchange(layoverAirportDto.getCurrencyExchange())
			.luggageStorage(layoverAirportDto.getLuggageStorage())
			.informationCenter(layoverAirportDto.getInformationCenter())
			.build();
	}

}
