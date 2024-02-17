package com.example.viaflight.dto.frameAboutDB.outLayoverAirport;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodSpotDBFrameDto {

	private String foodSpotName;
	private Double openTime;
	private Double closeTime;
	private String businessTime;
	private String information;
	private String phoneNumber;
	private String type;
	private String imageURL;
	private String layoverAirportId;

}
