package com.quadromotion.config;

public class OffsetConfig {
	
	private double maxAngleX = 0;
	private double maxSpeedX = 0;
	private double speedOffsetX = 0;
	private double angleOffsetX = 0;
	private double functionExpX = 0;
	
	private double maxAngleY = 0;
	private double maxSpeedY = 0;
	private double speedOffsetY = 0;
	private double angleOffsetY = 0;
	private double functionExpY = 0;
	
	private double maxAngleZ = 0;
	private double maxSpeedZ = 0;
	private double speedOffsetZ = 0;
	private double angleOffsetZ = 0;
	private double functionExpZ = 0;
	
	private double maxAngleSpin = 0;
	private double maxSpeedSpin = 0;
	private double speedOffsetSpin = 0;
	private double angleOffsetSpin = 0;
	private double functionExpSpin = 0;
	
	/**
	 * 
	 */
	public OffsetConfig(){
		
	}
	
	/**
	 * 
	 * @param maxAngleX
	 * @param maxSpeedX
	 * @param speedOffsetX
	 * @param angleOffsetX
	 * @param functionExpX
	 */
	public void XOffsetConfig(double maxAngleX, double maxSpeedX, double speedOffsetX, double angleOffsetX, 
			double functionExpX) {
		
		this.maxAngleX = maxAngleX;
		this.maxSpeedX = maxSpeedX;
		this.speedOffsetX = speedOffsetX;
		this.angleOffsetX = angleOffsetX;
		this.functionExpX = functionExpX;
	}
	
	/**
	 * 
	 * @param maxAngleY
	 * @param maxSpeedY
	 * @param speedOffsetY
	 * @param angleOffsetY
	 * @param functionExpY
	 */
	public void YOffsetConfig(double maxAngleY, double maxSpeedY, double speedOffsetY, double angleOffsetY,
			double functionExpY) {
		
		this.maxAngleY = maxAngleY;
		this.maxSpeedY = maxSpeedY;
		this.speedOffsetY = speedOffsetY;
		this.angleOffsetY = angleOffsetY;
		this.functionExpY = functionExpY;
	}
	
	/**
	 * 
	 * @param maxAngleZ
	 * @param maxSpeedZ
	 * @param speedOffsetZ
	 * @param angleOffsetZ
	 * @param functionExpZ
	 */
	public void ZOffsetConfig(double maxAngleZ, double maxSpeedZ, double speedOffsetZ, double angleOffsetZ,
			double functionExpZ) {
		
		this.maxAngleZ = maxAngleZ;
		this.maxSpeedZ = maxSpeedZ;
		this.speedOffsetZ = speedOffsetZ;
		this.angleOffsetZ = angleOffsetZ;
		this.functionExpZ = functionExpZ;
	}
	
	/**
	 * 
	 * @param maxAngleSpin
	 * @param maxSpeedSpin
	 * @param speedOffsetSpin
	 * @param angleOffsetSpin
	 * @param functionExpSpin
	 */
	public void SpinOffsetConfig(double maxAngleSpin, double maxSpeedSpin, double speedOffsetSpin, double angleOffsetSpin,
			double functionExpSpin) {
		
		this.maxAngleSpin = maxAngleSpin;
		this.maxSpeedSpin = maxSpeedSpin;
		this.speedOffsetSpin = speedOffsetSpin;
		this.angleOffsetSpin = angleOffsetSpin;
		this.functionExpSpin = functionExpSpin;
	}
	

	public void setMaxAngleX(double maxAngleX) {
		this.maxAngleX = maxAngleX;
	}

	public void setMaxSpeedX(double maxSpeedX) {
		this.maxSpeedX = maxSpeedX;
	}

	public void setSpeedOffsetX(double speedOffsetX) {
		this.speedOffsetX = speedOffsetX;
	}

	public void setAngleOffsetX(double angleOffsetX) {
		this.angleOffsetX = angleOffsetX;
	}

	public void setFunctionExpX(double functionExpX) {
		this.functionExpX = functionExpX;
	}

	public void setMaxAngleY(double maxAngleY) {
		this.maxAngleY = maxAngleY;
	}

	public void setMaxSpeedY(double maxSpeedY) {
		this.maxSpeedY = maxSpeedY;
	}

	public void setSpeedOffsetY(double speedOffsetY) {
		this.speedOffsetY = speedOffsetY;
	}

	public void setAngleOffsetY(double angleOffsetY) {
		this.angleOffsetY = angleOffsetY;
	}

	public void setFunctionExpY(double functionExpY) {
		this.functionExpY = functionExpY;
	}

	public void setMaxAngleZ(double maxAngleZ) {
		this.maxAngleZ = maxAngleZ;
	}

	public void setMaxSpeedZ(double maxSpeedZ) {
		this.maxSpeedZ = maxSpeedZ;
	}

	public void setSpeedOffsetZ(double speedOffsetZ) {
		this.speedOffsetZ = speedOffsetZ;
	}

	public void setAngleOffsetZ(double angleOffsetZ) {
		this.angleOffsetZ = angleOffsetZ;
	}

	public void setFunctionExpZ(double functionExpZ) {
		this.functionExpZ = functionExpZ;
	}

	public void setMaxAngleSpin(double maxAngleSpin) {
		this.maxAngleSpin = maxAngleSpin;
	}

	public void setMaxSpeedSpin(double maxSpeedSpin) {
		this.maxSpeedSpin = maxSpeedSpin;
	}

	public void setSpeedOffsetSpin(double speedOffsetSpin) {
		this.speedOffsetSpin = speedOffsetSpin;
	}

	public void setAngleOffsetSpin(double angleOffsetSpin) {
		this.angleOffsetSpin = angleOffsetSpin;
	}

	public void setFunctionExpSpin(double functionExpSpin) {
		this.functionExpSpin = functionExpSpin;
	}

	public double getMaxAngleX() {
		return maxAngleX;
	}

	public double getMaxSpeedX() {
		return maxSpeedX;
	}

	public double getSpeedOffsetX() {
		return speedOffsetX;
	}

	public double getAngleOffsetX() {
		return angleOffsetX;
	}

	public double getFunctionExpX() {
		return functionExpX;
	}

	public double getMaxAngleY() {
		return maxAngleY;
	}

	public double getMaxSpeedY() {
		return maxSpeedY;
	}

	public double getSpeedOffsetY() {
		return speedOffsetY;
	}

	public double getAngleOffsetY() {
		return angleOffsetY;
	}

	public double getFunctionExpY() {
		return functionExpY;
	}

	public double getMaxAngleZ() {
		return maxAngleZ;
	}

	public double getMaxSpeedZ() {
		return maxSpeedZ;
	}

	public double getSpeedOffsetZ() {
		return speedOffsetZ;
	}

	public double getAngleOffsetZ() {
		return angleOffsetZ;
	}

	public double getFunctionExpZ() {
		return functionExpZ;
	}

	public double getMaxAngleSpin() {
		return maxAngleSpin;
	}

	public double getMaxSpeedSpin() {
		return maxSpeedSpin;
	}

	public double getSpeedOffsetSpin() {
		return speedOffsetSpin;
	}

	public double getAngleOffsetSpin() {
		return angleOffsetSpin;
	}

	public double getFunctionExpSpin() {
		return functionExpSpin;
	}

}
