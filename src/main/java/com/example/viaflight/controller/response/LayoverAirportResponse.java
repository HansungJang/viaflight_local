package com.example.viaflight.controller.response;

import com.example.viaflight.dto.frameAboutDB.airportDto.LayoverAirportDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.AirportEventsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.RestsDBFrameDto;
import com.example.viaflight.dto.frameAboutDB.inLayoverAirportDto.ShoppingOptionsDBFrameDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Builder
public class LayoverAirportResponse {

	LayoverAirportDBFrameDto layoverAirportDBFrameDto;
	List<AirportEventsDBFrameDto> airportEventsDBFrameDtoList;
	List<MealOptionsDBFrameDto> mealOptionsDBFrameDtoList;
	List<RestsDBFrameDto> restsDBFrameDtoList;
	List<ShoppingOptionsDBFrameDto> shoppingOptionsDBFrameDtoList;

	public LayoverAirportResponse(LayoverAirportDBFrameDto layoverAirportDBFrameDto, List<AirportEventsDBFrameDto> airportEventsDBFrameDtoList, List<MealOptionsDBFrameDto> mealOptionsDBFrameDtoList, List<RestsDBFrameDto> restsDBFrameDtoList, List<ShoppingOptionsDBFrameDto> shoppingOptionsDBFrameDtoList) {
		this.layoverAirportDBFrameDto = layoverAirportDBFrameDto;
		this.airportEventsDBFrameDtoList = airportEventsDBFrameDtoList;
		this.mealOptionsDBFrameDtoList = mealOptionsDBFrameDtoList;
		this.restsDBFrameDtoList = restsDBFrameDtoList;
		this.shoppingOptionsDBFrameDtoList = shoppingOptionsDBFrameDtoList;
	}

}
