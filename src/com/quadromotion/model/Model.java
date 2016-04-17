package com.quadromotion.model;

import java.util.Observable;

import com.quadromotion.model.convertion.AngleToSpeedConverter;

public class Model extends Observable {

	private double speedX;
	private double speedY;
	private double speedZ;
	private double speedSpin;
	private boolean takeOff;
	private boolean landing;
	private boolean hover;
	private boolean isFlying;
	private boolean isHovering;
	private boolean isConnected;
	private boolean oneHandControl;
	
	private AngleToSpeedConverter convertX = null;
	private AngleToSpeedConverter convertY = null;
	private AngleToSpeedConverter convertZ = null;
	private AngleToSpeedConverter convertSpin = null;
	
	public Model() {

		super();
		this.speedX = 0;
		this.speedY = 0;
		this.speedZ = 0;
		this.speedSpin = 0;
		this.takeOff = false;
		this.landing = false;
		this.hover = false;
		this.isFlying = false;
		this.isHovering = false;
		this.isConnected = false;
		this.oneHandControl = false;
		
		convertX = new AngleToSpeedConverter();
		convertY = new AngleToSpeedConverter();
		convertZ = new AngleToSpeedConverter();
		convertSpin = new AngleToSpeedConverter();
	}

	public double getSpeedX() {
		return speedX;
	}

	public void setSpeedX(double speed) {
		this.speedX = convertX.expConverter(speed);
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(speed);
		}
	}

	public double getSpeedY() {
		return speedY;
	}

	public void setSpeedY(double speed) {
		this.speedY = convertY.expConverter(speed);
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(speed);
		}
	}

	public double getSpeedZ() {
		return speedZ;
	}

	public void setSpeedZ(double speed) {
		this.speedZ = convertZ.expConverter(speed);
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(speed);
		}
	}

	public double getSpeedSpeed() {
		return speedSpin;
	}

	public void setSpeedSpin(double speed) {
		this.speedSpin = convertSpin.expConverter(speed);
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(speed);
		}
	}

	public boolean isTakeOff() {
		return takeOff;
	}

	public void setTakeOff(boolean takeOff) {
		this.takeOff = takeOff;
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(takeOff);
		}
	}

	public boolean isLanding() {
		return landing;
	}

	public void setLanding(boolean landing) {
		this.landing = landing;
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(landing);
		}
	}

	public boolean isHover() {
		return hover;
	}

	public void setHover(boolean hover) {
		this.hover = hover;
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(hover);
		}
	}

}
