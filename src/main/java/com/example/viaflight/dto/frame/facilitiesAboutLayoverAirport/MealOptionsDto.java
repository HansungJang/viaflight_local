package com.example.viaflight.dto.frame.facilitiesAboutLayoverAirport;

import com.example.viaflight.domain.frame.faciliteAboutLayoverAirport.MealOptions;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MealOptionsDto {

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
	private String imageURL;

	public MealOptionsDto from(MealOptions mealOptions) {
		return MealOptionsDto.builder()
				.mealName(mealOptions.getMealName())
				.openTime(mealOptions.getOpenTime())
				.closeTime(mealOptions.getCloseTime())
				.businessHours(mealOptions.getBusinessHours())
				.location(mealOptions.getLocation())
				.information(mealOptions.getInformation())
				.phoneNumber(mealOptions.getPhoneNumber())
				.cost(mealOptions.getCost())
				.blog(mealOptions.getBlog())
				.type(mealOptions.getType())
				.imageURL(mealOptions.getImageURL())
				.build();
	}

}
