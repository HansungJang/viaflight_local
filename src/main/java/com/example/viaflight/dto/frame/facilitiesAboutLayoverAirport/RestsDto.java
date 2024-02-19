package com.example.viaflight.dto.frame.facilitiesAboutLayoverAirport;

import com.example.viaflight.domain.frame.faciliteAboutLayoverAirport.Rests;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.RestsDBFrameDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestsDto {

	private String restName;
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

	public RestsDto from(Rests rests) {
		return RestsDto.builder()
				.restName(rests.getRestName())
				.openTime(rests.getOpenTime())
				.closeTime(rests.getCloseTime())
				.businessHours(rests.getBusinessHours())
				.location(rests.getLocation())
				.information(rests.getInformation())
				.phoneNumber(rests.getPhoneNumber())
				.cost(rests.getCost())
				.blog(rests.getBlog())
				.type(rests.getType())
				.imageURL(rests.getImageURL())
				.build();
	}

	public RestsDto from(RestsDBFrameDto restsDBFrameDto) {
		return RestsDto.builder()
				.restName(restsDBFrameDto.getRestName())
				.openTime(restsDBFrameDto.getOpenTime())
				.closeTime(restsDBFrameDto.getCloseTime())
				.businessHours(restsDBFrameDto.getBusinessHours())
				.location(restsDBFrameDto.getLocation())
				.information(restsDBFrameDto.getInformation())
				.phoneNumber(restsDBFrameDto.getPhoneNumber())
				.cost(restsDBFrameDto.getCost())
				.blog(restsDBFrameDto.getBlog())
				.type(restsDBFrameDto.getType())
				.imageURL(restsDBFrameDto.getImageURL())
				.build();
	}



}
