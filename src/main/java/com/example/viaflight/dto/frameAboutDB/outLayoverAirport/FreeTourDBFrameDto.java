package com.example.viaflight.dto.frameAboutDB.outLayoverAirport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FreeTourDBFrameDto {
	private String freeTourName;
	private String Route;
	private String businessTime;
	private String information;
	private String cost;
	private String homepage;
	private String type;
	private String imageURL;
	private String layoverAirportId;

}
