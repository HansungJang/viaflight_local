//package com.example.viaflight.controller.response.여기있는내용들전부를_하나의_class로_변수_처리해서_프론트측에_한번에_보내야하는_것;
//
//import com.example.viaflight.dto.frame.facilitiesAboutLayoverAirport.AirportEventsDto;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//public class AirportEventResponse {
//	private Long plannedEventsId;
//	private String eventName;
//	private String usedTime;
//	private String information;
//	private String cost;
//	private String reservationUrl;
//	private String type;
//
//	public AirportEventResponse from(AirportEventsDto airportEventDto){
//		return AirportEventResponse.builder()
//				.plannedEventsId(airportEventDto.getPlannedEventsId())
//				.eventName(airportEventDto.getEventName())
//				.usedTime(airportEventDto.getUsedTime())
//				.information(airportEventDto.getInformation())
//				.cost(airportEventDto.getCost())
//				.reservationUrl(airportEventDto.getReservationUrl())
//				.type(airportEventDto.getType())
//				.build();
//	}
//}
