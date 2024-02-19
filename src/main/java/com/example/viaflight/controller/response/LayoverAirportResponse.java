package com.example.viaflight.controller.response;

import com.example.viaflight.dto.frameAboutDB.airportDto.LayoverAirportDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.AirportEventsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.RestsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.ShoppingOptionsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FoodSpotDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.FreeTourDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.outLayoverAirport.PaidActivityDBFrameDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Builder
public class LayoverAirportResponse {

	// filter 이름 수정ㅎ
	LayoverAirportDBFrameDto layoverAirportDBFrameDto;
	List<AirportEventsDBFrameDto> airportEventsDBFrameDtoList;
	List<MealOptionsDBFrameDto> mealOptionsDBFrameDtoList;
	List<RestsDBFrameDto> restsDBFrameDtoList;
	List<ShoppingOptionsDBFrameDto> shoppingOptionsDBFrameDtoList;
	List<FoodSpotDBFrameDto> foodSpotDBFrameDtoList;
	List<FreeTourDBFrameDto> freeTourDBFrameDtoList;
	List<PaidActivityDBFrameDto> paidActivityDBFrameDtoList;


	public LayoverAirportResponse(LayoverAirportDBFrameDto layoverAirportDBFrameDto, List<AirportEventsDBFrameDto> airportEventsDBFrameDtoList, List<MealOptionsDBFrameDto> mealOptionsDBFrameDtoList, List<RestsDBFrameDto> restsDBFrameDtoList, List<ShoppingOptionsDBFrameDto> shoppingOptionsDBFrameDtoList, List<FoodSpotDBFrameDto> foodSpotDBFrameDtoList, List<FreeTourDBFrameDto> freeTourDBFrameDtoList, List<PaidActivityDBFrameDto> paidActivityDBFrameDtoList) {
		this.layoverAirportDBFrameDto = layoverAirportDBFrameDto;

		this.airportEventsDBFrameDtoList = airportEventsDBFrameDtoList;
		this.mealOptionsDBFrameDtoList = mealOptionsDBFrameDtoList;
		this.restsDBFrameDtoList = restsDBFrameDtoList;
		this.shoppingOptionsDBFrameDtoList = shoppingOptionsDBFrameDtoList;

		this.foodSpotDBFrameDtoList = foodSpotDBFrameDtoList;
		this.freeTourDBFrameDtoList = freeTourDBFrameDtoList;
		this.paidActivityDBFrameDtoList = paidActivityDBFrameDtoList;
	}

}
