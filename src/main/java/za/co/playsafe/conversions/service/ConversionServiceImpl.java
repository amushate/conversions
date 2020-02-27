package za.co.playsafe.conversions.service;

import org.springframework.stereotype.Service;

import za.co.playsafe.conversions.utils.PlaySafeConstants;

@Service
public class ConversionServiceImpl implements ConversionService{

	@Override
	public double kelvinTocelsius(double kelvin) {
		return kelvin-PlaySafeConstants.KELVIN_TO_CELCIOUS_FACTOR;
	}

}
