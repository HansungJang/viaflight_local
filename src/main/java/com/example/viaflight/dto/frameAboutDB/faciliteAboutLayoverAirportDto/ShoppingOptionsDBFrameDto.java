package com.example.viaflight.dto.frameAboutDB.faciliteAboutLayoverAirportDto;

import com.example.viaflight.domain.frameAboutDB.faciliteAboutLayoverAirport.ShoppingOptionsDBFrame;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShoppingOptionsDBFrameDto {

	private String shoppingOptionsName;
	private String openTime;
	private String closeTime;
	private String businessHours;
	private String location;
	private String information;
	private String phoneNumber;
	private String blog;
	private String cost;
	private String type;
	private String layoverAirlineId;
	private String imageURL;

	public ShoppingOptionsDBFrameDto from(ShoppingOptionsDBFrame shoppingOptionsDBFrame) {
		return ShoppingOptionsDBFrameDto.builder()
				.shoppingOptionsName(shoppingOptionsDBFrame.getShoppingOptionsName())
				.openTime(shoppingOptionsDBFrame.getOpenTime())
				.closeTime(shoppingOptionsDBFrame.getCloseTime())
				.businessHours(shoppingOptionsDBFrame.getBusinessHours())
				.location(shoppingOptionsDBFrame.getLocation())
				.information(shoppingOptionsDBFrame.getInformation())
				.phoneNumber(shoppingOptionsDBFrame.getPhoneNumber())
				.blog(shoppingOptionsDBFrame.getBlog())
				.cost(shoppingOptionsDBFrame.getCost())
				.type(shoppingOptionsDBFrame.getType())
				.layoverAirlineId(shoppingOptionsDBFrame.getLayoverAirlineId())
				.imageURL(shoppingOptionsDBFrame.getImageURL())
				.build();
	}

}
