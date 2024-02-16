package com.example.viaflight.controller.response.여기있는내용들전부를_하나의_class로_변수_처리해서_프론트측에_한번에_보내야하는_것;

import com.example.viaflight.dto.frame.facilitiesAboutLayoverAirport.RestsDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestResponse {

	private Long RestId;
	private String openTime;
	private String closeTime;
	private String location;
	private String information;
	private String phoneNumber;
	private String blog;
	private String cost;
	private String type;

//	public RestResponse from(RestsDto restDto){
//		return RestResponse.builder()
//				.RestId(restDto.getRestId())
//				.openTime(restDto.getOpenTime())
//				.closeTime(restDto.getCloseTime())
//				.location(restDto.getLocation())
//				.information(restDto.getInformation())
//				.phoneNumber(restDto.getPhoneNumber())
//				.blog(restDto.getBlog())
//				.cost(restDto.getCost())
//				.type(restDto.getType())
//				.build();
//	}
}
