package com.quadromotion.model.convertion;

// converts the input angle value to the output speed 
public class AngleToSpeedConverter implements IAngleToSpeedConverter{
	
	private final int maxAngle = 80;
	private final int maxSpeed = 50;
	private final int speedOffset = 10;
	private final int angleOffset = 15;
		
	private final double functionExp = 2.1;
	
	private double inputValue;
	private double outputValue;

	
	public AngleToSpeedConverter(){
		inputValue = 0;
		outputValue = 0;
	}
	
	public AngleToSpeedConverter(int inputValue){
		this.inputValue = inputValue;
	}

	@Override
	public double expConverter(double inputValue) {
		// TODO exponentielle umrechnung
				
		boolean inputSign = false;		
		
		double functionSpeed = 0;
		double functionMaxAngle = 0;
		
		if(inputValue < 0){
			inputSign = true; // signe négatif
		}
		
		inputValue = Math.abs(inputValue);
		functionMaxAngle = maxAngle - angleOffset;		
		functionSpeed = Math.pow((inputValue - angleOffset)/functionMaxAngle, functionExp);
		functionSpeed = functionSpeed*(maxSpeed - speedOffset); 
		outputValue = functionSpeed + speedOffset;
		
		/**changement de signe*/
		
		if(inputSign){
			outputValue = -outputValue; 
		}
		

		return outputValue;
	}

	@Override
	public double linearConverter(double inputValue) {
		// TODO lineare umrechnung
		outputValue = inputValue;
		return outputValue;
	}

	@Override
	public double getInputValue() {
		return inputValue;
	}

	@Override
	public void setInputValue(int inputValue) {
		this.inputValue = inputValue;
	}

	@Override
	public double getOutputValue() {
		// TODO Auto-generated method stub
		return outputValue;
	}

	public int getMaxAngle() {
		return maxAngle;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

}
