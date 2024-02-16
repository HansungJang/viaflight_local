package com.example.viaflight.dto.frameAboutDB.faciliteAboutLayoverAirportDto;

import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.MealOptionsDBFrame;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MealOptionsDBFrameDto {

	private String mealName;
	private String openTime;
	private String closeTime;
	private String businessHours;
	private String location;
	private String information;
	private String phoneNumber;
	private String cost;
	private String blog;
	private String type;
	private String layoverAirportId;
	private String imageURL;

	public MealOptionsDBFrameDto from(MealOptionsDBFrame mealOptionsDBFrame) {
		return MealOptionsDBFrameDto.builder()
				.mealName(mealOptionsDBFrame.getMealName())
				.openTime(mealOptionsDBFrame.getOpenTime())
				.closeTime(mealOptionsDBFrame.getCloseTime())
				.businessHours(mealOptionsDBFrame.getBusinessHours())
				.location(mealOptionsDBFrame.getLocation())
				.information(mealOptionsDBFrame.getInformation())
				.phoneNumber(mealOptionsDBFrame.getPhoneNumber())
				.cost(mealOptionsDBFrame.getCost())
				.blog(mealOptionsDBFrame.getBlog())
				.type(mealOptionsDBFrame.getType())
				.layoverAirportId(mealOptionsDBFrame.getLayoverAirportId())
				.imageURL(mealOptionsDBFrame.getImageURL())
				.build();
	}

}
