package com.example.viaflight.dto.frameAboutDB.outLayoverAirport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaidActivityDBFrameDto {

 	private String paidActivityName;
	private Double openTime;
	private Double closeTime;
	private Double usedTime;
	private String businessTime;
	private String information;
	private String cost;
	private String homepage;
	private String type;
	private String imageURL;
	private String layoverAirportId;

}
