package com.namma.api.dto;




import java.time.Instant;
import java.time.LocalTime;
import java.util.List;

import com.namma.api.enumeration.RideStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RideDto {
	private Long id;
	private Long userId;
	private Double pickUpLatitiude;
	private Double pickUpLongitute;
	private Double dropLatitude;
	private Double dropLongitute;
	private List<Instant> date;
	private LocalTime pickUpTime;
	private RideStatus status;
	private String metadata;
}
