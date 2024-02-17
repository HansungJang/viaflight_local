package com.example.viaflight.domain.frame.faciliteAboutLayoverAirport;

import com.example.viaflight.domain.frame.airport.LayoverAirport;
import com.example.viaflight.dto.frame.facilitiesAboutLayoverAirport.ShoppingOptionsDto;
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
public class ShoppingOptions {
	
	// 면세, 쇼핑
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name =  "shopping_options_id" ,nullable = false)
	private Long shoppingOptionsId;

	@Column(name = "shopping_options_name", nullable = false)
	private String shoppingOptionsName;

	@Column(name = "open_time", nullable = false)
	private Double openTime;

	@Column(name = "close_time", nullable = false)
	private Double closeTime;

	@Column(name = "business_hours", nullable = false)
	private String businessHours;

	@Column(name = "location", nullable = false)
	private String location;

	@Column(name = "information", nullable = false, length = 1000)
	private String information;

	@Column(name = "phone_number", nullable = true)
	private String phoneNumber;

	@Column(name = "blog", nullable = true)
	private String blog;

	@Column(name = "cost", nullable = true)
	private String cost;

	@Column(name = "type", nullable = false)
	private String type;

	@Column(name = "image_url" ,nullable = true)
	private String imageURL;

	@ManyToOne
	@JoinColumn(name = "layover_airport_id")
	private LayoverAirport layoverAirport;

	public ShoppingOptions from(ShoppingOptionsDto shoppingOptionsDto) {
		return ShoppingOptions.builder()
				.shoppingOptionsName(shoppingOptionsDto.getShoppingOptionsName())
				.openTime(shoppingOptionsDto.getOpenTime())
				.closeTime(shoppingOptionsDto.getCloseTime())
				.businessHours(shoppingOptionsDto.getBusinessHours())
				.location(shoppingOptionsDto.getLocation())
				.information(shoppingOptionsDto.getInformation())
				.phoneNumber(shoppingOptionsDto.getPhoneNumber())
				.blog(shoppingOptionsDto.getBlog())
				.cost(shoppingOptionsDto.getCost())
				.type(shoppingOptionsDto.getType())
				.imageURL(shoppingOptionsDto.getImageURL())
				.build();
	}

}
