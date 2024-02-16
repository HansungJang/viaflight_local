package com.example.viaflight.domain.frame.faciliteAboutLayoverAirport;

import com.example.viaflight.domain.frame.airport.LayoverAirport;
import com.example.viaflight.dto.frame.facilitiesAboutLayoverAirport.MealOptionsDto;
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
public class MealOptions {

	// 식사, 카페, 디저트

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "meal_options_id",nullable = false)
	private Long mealOptionsId;

	@Column(name = "meal_name", nullable = false)
	private String mealName;

	@Column(name = "open_time", nullable = false)
	private String openTime;

	@Column(name = "close_time", nullable = false)
	private String closeTime;

	@Column(name = "business_hours", nullable = false)
	private String businessHours;

	@Column(name = "location", nullable = false)
	private String location;

	@Column(name = "information", nullable = false, length = 1000)
	private String information;

	@Column(name = "phone_number", nullable = true)
	private String phoneNumber;

	@Column(name = "cost", nullable = true)
	private String cost;

	@Column(name = "blog", nullable = true)
	private String blog;

	@Column(name = "type", nullable = false)
	private String type;

	@Column(name = "image_url" ,nullable = true)
	private String imageURL;

	@ManyToOne
	@JoinColumn(name = "layover_airport_id")
	private LayoverAirport layoverAirport;

	public MealOptions from(MealOptionsDto mealOptionsDto) {
		return MealOptions.builder()
				.mealName(mealOptionsDto.getMealName())
				.openTime(mealOptionsDto.getOpenTime())
				.closeTime(mealOptionsDto.getCloseTime())
				.businessHours(mealOptionsDto.getBusinessHours())
				.location(mealOptionsDto.getLocation())
				.information(mealOptionsDto.getInformation())
				.phoneNumber(mealOptionsDto.getPhoneNumber())
				.cost(mealOptionsDto.getCost())
				.blog(mealOptionsDto.getBlog())
				.type(mealOptionsDto.getType())
				.imageURL(mealOptionsDto.getImageURL())
				.build();
	}


}
