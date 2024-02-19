package com.example.viaflight.domain.frame.faciliteAboutLayoverAirport;

import com.example.viaflight.domain.frame.airport.LayoverAirport;
import com.example.viaflight.dto.frame.facilitiesAboutLayoverAirport.AirportEventsDto;
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
public class AirportEvents {

	// 공항 event

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "planned_events_id" ,nullable = false)
	private Long plannedEventsId;

	@Column(name = "event_name", nullable = false)
	private String eventName;

	@Column(name = "location", nullable = false)
	private String location;

	@Column(name = "open_time", nullable = false)
	private Double openTime;

	@Column(name = "close_time", nullable = false)
	private Double closeTime;

	@Column(name = "business_hours", nullable = false)
	private String businessHours;

	@Column(name = "information", nullable = true, length = 1000)
	private String information;

	@Column(name = "cost", nullable = true, length = 1000)
	private String cost;

	@Column(name = "reservation_url", nullable = true)
	private String reservationUrl;

	@Column(name = "type", nullable = false)
	private String type;

	@Column(name = "image_url" ,nullable = true)
	private String imageURL;

	@ManyToOne
	@JoinColumn(name = "layover_airport_id")
	private LayoverAirport layoverAirport;

	public AirportEvents from(AirportEventsDto airportEventsDto) {
		return AirportEvents.builder()
				.eventName(airportEventsDto.getEventName())
				.location(airportEventsDto.getLocation())
				.openTime(airportEventsDto.getOpenTime())
				.closeTime(airportEventsDto.getCloseTime())
				.businessHours(airportEventsDto.getBusinessHours())
				.information(airportEventsDto.getInformation())
				.cost(airportEventsDto.getCost())
				.reservationUrl(airportEventsDto.getReservationUrl())
				.type(airportEventsDto.getType())
				.imageURL(airportEventsDto.getImageURL())
				.build();
	}

	public AirportEvents(AirportEventsDto airportEventsDto) {
		this.eventName = airportEventsDto.getEventName();
		this.location = airportEventsDto.getLocation();
		this.openTime = airportEventsDto.getOpenTime();
		this.closeTime = airportEventsDto.getCloseTime();
		this.businessHours = airportEventsDto.getBusinessHours();
		this.information = airportEventsDto.getInformation();
		this.cost = airportEventsDto.getCost();
		this.reservationUrl = airportEventsDto.getReservationUrl();
		this.type = airportEventsDto.getType();
		this.imageURL = airportEventsDto.getImageURL();
	}

}
