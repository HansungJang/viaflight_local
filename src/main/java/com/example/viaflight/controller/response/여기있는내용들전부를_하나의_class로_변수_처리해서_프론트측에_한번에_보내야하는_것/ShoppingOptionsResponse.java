package com.example.viaflight.controller.response.여기있는내용들전부를_하나의_class로_변수_처리해서_프론트측에_한번에_보내야하는_것;

import com.example.viaflight.dto.frame.facilitiesAboutLayoverAirport.ShoppingOptionsDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShoppingOptionsResponse {

	private Long shoppingOptionsId;
	private String openTime;
	private String closeTime;
	private String location;
	private String information;
	private String phoneNumber;
	private String storeUrl;
	private String cost;
	private String type;

//	public ShoppingOptionsResponse from(ShoppingOptionsDto shoppingOptionsDto){
//		return ShoppingOptionsResponse.builder()
//				.shoppingOptionsId(shoppingOptionsDto.getShoppingOptionsId())
//				.openTime(shoppingOptionsDto.getOpenTime())
//				.closeTime(shoppingOptionsDto.getCloseTime())
//				.location(shoppingOptionsDto.getLocation())
//				.information(shoppingOptionsDto.getInformation())
//				.phoneNumber(shoppingOptionsDto.getPhoneNumber())
//				.storeUrl(shoppingOptionsDto.getStoreUrl())
//				.cost(shoppingOptionsDto.getCost())
//				.type(shoppingOptionsDto.getType())
//				.build();
//	}

}
