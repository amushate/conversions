package za.co.playsafe.conversions.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.playsafe.conversions.dto.ConversionRequestDto;
import za.co.playsafe.conversions.service.ConversionService;

@RestController
@RequestMapping("/conversions")
public class ConversionController {

	@Autowired
	private ConversionService conversionService;

	
	@PostMapping("/ktoc")
	public double kelvinToCelsius(@Valid @RequestBody ConversionRequestDto request){
		return conversionService.kelvinTocelsius(request.getInputValue());
	}

	
	@PostMapping("/ctok")
	public double celsiusToKelvin(@Valid @RequestBody ConversionRequestDto request){
		return conversionService.celsiusToKelvin(request.getInputValue());
	}

}
