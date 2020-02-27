package za.co.playsafe.conversions.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@NotNull(message="Request can not be empty")
public class ConversionRequestDto {

	@NotNull
	@Digits(fraction = 2, integer = 16)
	private double inputValue;

	public double getInputValue() {
		return inputValue;
	}

	public void setInputValue(double inputValue) {
		this.inputValue = inputValue;
	}
}
