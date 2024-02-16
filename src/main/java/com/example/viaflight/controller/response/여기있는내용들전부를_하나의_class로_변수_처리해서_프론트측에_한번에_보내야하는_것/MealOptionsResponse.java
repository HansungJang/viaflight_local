package com.example.viaflight.controller.response.여기있는내용들전부를_하나의_class로_변수_처리해서_프론트측에_한번에_보내야하는_것;

import com.example.viaflight.dto.frame.facilitiesAboutLayoverAirport.MealOptionsDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MealOptionsResponse {

	private Long mealOptionsId;
	private String openTime;
	private String closeTime;
	private String location;
	private String information;
	private String phoneNumber;
	private String type;

//	public MealOptionsResponse from(MealOptionsDto mealOptionsDto){
//		return MealOptionsResponse.builder()
//				.mealOptionsId(mealOptionsDto.getMealOptionsId())
//				.openTime(mealOptionsDto.getOpenTime())
//				.closeTime(mealOptionsDto.getCloseTime())
//				.location(mealOptionsDto.getLocation())
//				.information(mealOptionsDto.getInformation())
//				.phoneNumber(mealOptionsDto.getPhoneNumber())
//				.type(mealOptionsDto.getType())
//				.build();
//	}

}
