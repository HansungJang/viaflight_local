package com.example.viaflight.dto.frame.facilitiesAboutLayoverAirport;

import com.example.viaflight.domain.frame.faciliteAboutLayoverAirport.ShoppingOptions;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.ShoppingOptionsDBFrameDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShoppingOptionsDto {

	private String shoppingOptionsName;
	private Double openTime;
	private Double closeTime;
	private String businessHours;
	private String location;
	private String information;
	private String phoneNumber;
	private String blog;
	private String cost;
	private String type;
	private String imageURL;

	public ShoppingOptionsDto from(ShoppingOptions shoppingOptions) {
		return ShoppingOptionsDto.builder()
				.shoppingOptionsName(shoppingOptions.getShoppingOptionsName())
				.openTime(shoppingOptions.getOpenTime())
				.closeTime(shoppingOptions.getCloseTime())
				.businessHours(shoppingOptions.getBusinessHours())
				.location(shoppingOptions.getLocation())
				.information(shoppingOptions.getInformation())
				.phoneNumber(shoppingOptions.getPhoneNumber())
				.cost(shoppingOptions.getCost())
				.blog(shoppingOptions.getBlog())
				.type(shoppingOptions.getType())
				.imageURL(shoppingOptions.getImageURL())
				.build();
	}

	public ShoppingOptionsDto from(ShoppingOptionsDBFrameDto shoppingOptionsDBFrameDto) {
		return ShoppingOptionsDto.builder()
				.shoppingOptionsName(shoppingOptionsDBFrameDto.getShoppingOptionsName())
				.openTime(shoppingOptionsDBFrameDto.getOpenTime())
				.closeTime(shoppingOptionsDBFrameDto.getCloseTime())
				.businessHours(shoppingOptionsDBFrameDto.getBusinessHours())
				.location(shoppingOptionsDBFrameDto.getLocation())
				.information(shoppingOptionsDBFrameDto.getInformation())
				.phoneNumber(shoppingOptionsDBFrameDto.getPhoneNumber())
				.cost(shoppingOptionsDBFrameDto.getCost())
				.blog(shoppingOptionsDBFrameDto.getBlog())
				.type(shoppingOptionsDBFrameDto.getType())
				.imageURL(shoppingOptionsDBFrameDto.getImageURL())
				.build();
	}

}
