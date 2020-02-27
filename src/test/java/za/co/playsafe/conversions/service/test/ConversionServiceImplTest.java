package za.co.playsafe.conversions.service.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import za.co.playsafe.conversions.service.ConversionServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ConversionServiceImplTest {

	@InjectMocks
	private ConversionServiceImpl conversionServiceImpl;
	
	@Test
	public void shouldConvertKelvinToCelsius() {
		double kelvin = 293.15;
		double celcius = conversionServiceImpl.kelvinTocelsius(kelvin);
		assertEquals(20.0, celcius,0);
	}
	
	@Test
	public void shouldConvertCelsiusToKelvin() {
		double celsius = 20.0;
		double kelvin = conversionServiceImpl.celsiusToKelvin(celsius);
		assertEquals(293.15, kelvin,0);
	}
}
