package com.example.viaflight.dto.frame.facilitiesAboutLayoverAirport;

import com.example.viaflight.domain.frame.faciliteAboutLayoverAirport.AirportEvents;
import com.example.viaflight.domain.frameAboutDB.inLayoverAirport.AirportEventsDBFrame;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.AirportEventsDBFrameDto;
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
	private Double openTime;
	private Double closeTime;
	private String businessHours;
	private String information;
	private String cost;
	private String reservationUrl;
	private String type;
	private String imageURL;

	public AirportEventsDto(AirportEventsDBFrame airportEventsDBFrame) {
		this.eventName = airportEventsDBFrame.getEventName();
		this.location = airportEventsDBFrame.getLocation();
		this.openTime = airportEventsDBFrame.getOpenTime();
		this.closeTime = airportEventsDBFrame.getCloseTime();
		this.businessHours = airportEventsDBFrame.getBusinessHours();
		this.information = airportEventsDBFrame.getInformation();
		this.cost = airportEventsDBFrame.getCost();
		this.reservationUrl = airportEventsDBFrame.getReservationUrl();
		this.type = airportEventsDBFrame.getType();
		this.imageURL = airportEventsDBFrame.getImageURL();
	}

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
