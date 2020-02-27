package za.co.playsafe.conversions.service;

import org.springframework.stereotype.Service;

import za.co.playsafe.conversions.utils.PlaySafeConstants;

@Service
public class ConversionServiceImpl implements ConversionService {

	@Override
	public double celsiusToKelvin(double celsius) {
		return celsius + PlaySafeConstants.KELVIN_TO_CELCIOUS_FACTOR;
	}

	@Override
	public double kelvinTocelsius(double kelvin) {
		return kelvin - PlaySafeConstants.KELVIN_TO_CELCIOUS_FACTOR;
	}

	@Override
	public double milesToKilometers(double miles) {
		return miles * PlaySafeConstants.MILE_TO_KILOMETER_FACTOR;
	}
	
	@Override
	public double kilometersToMiles(double km) {
		return km*PlaySafeConstants.KILOMETER_TO_MILE_FACTOR;
	}


}
