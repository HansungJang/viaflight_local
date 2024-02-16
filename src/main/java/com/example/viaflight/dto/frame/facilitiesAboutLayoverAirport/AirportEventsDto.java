package com.example.viaflight.dto.frame.facilitiesAboutLayoverAirport;

import com.example.viaflight.domain.frame.faciliteAboutLayoverAirport.AirportEvents;
import com.example.viaflight.dto.frameAboutDB.faciliteAboutLayoverAirportDto.AirportEventsDBFrameDto;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AirportEventsDto {

	private String eventName;
	private String location;
	private String openTime;
	private String closeTime;
	private String businessHours;
	private String information;
	private String cost;
	private String reservationUrl;
	private String type;
	private String imageURL;

	public AirportEventsDto from(AirportEvents airportEvents) {
		return AirportEventsDto.builder()
				.eventName(airportEvents.getEventName())
				.location(airportEvents.getLocation())
				.openTime(airportEvents.getOpenTime())
				.closeTime(airportEvents.getCloseTime())
				.businessHours(airportEvents.getBusinessHours())
				.information(airportEvents.getInformation())
				.cost(airportEvents.getCost())
				.reservationUrl(airportEvents.getReservationUrl())
				.type(airportEvents.getType())
				.imageURL(airportEvents.getImageURL())
				.build();
	}

	public AirportEventsDto from(AirportEventsDBFrameDto airportEventsDBFrameDto) {
		return AirportEventsDto.builder()
				.eventName(airportEventsDBFrameDto.getEventName())
				.location(airportEventsDBFrameDto.getLocation())
				.openTime(airportEventsDBFrameDto.getOpenTime())
				.closeTime(airportEventsDBFrameDto.getCloseTime())
				.businessHours(airportEventsDBFrameDto.getBusinessHours())
				.information(airportEventsDBFrameDto.getInformation())
				.cost(airportEventsDBFrameDto.getCost())
				.reservationUrl(airportEventsDBFrameDto.getReservationUrl())
				.type(airportEventsDBFrameDto.getType())
				.imageURL(airportEventsDBFrameDto.getImageURL())
				.build();
	}

}
