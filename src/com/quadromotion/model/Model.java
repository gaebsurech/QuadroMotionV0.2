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
	
	// FinaleStateMachine fsm = null;
	
	public Model() {

		super();
		this.speedX = 0;
		this.speedY = 0;
		this.speedZ = 0;
		this.speedSpin = 0;
		this.takeOff = false;
		this.landing = false;
		this.hover = false;
		this.setFlying(false);
		this.setHovering(false);
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
			notifyObservers(this.speedX);
		}
	}

	public double getSpeedY() {
		return speedY;
	}

	public void setSpeedY(double speed) {
		this.speedY = convertY.expConverter(speed);
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(this.speedY);
		}
	}

	public double getSpeedZ() {
		return speedZ;
	}

	public void setSpeedZ(double speed) {
		this.speedZ = convertZ.expConverter(speed);
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(this.speedZ);
		}
	}

	public double getSpeedSpin() {
		return speedSpin;
	}

	public void setSpeedSpin(double speed) {
		this.speedSpin = convertSpin.expConverter(speed);
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(this.speedSpin);
		}
	}

	public boolean isTakeOff() {
		return takeOff;
	}

	public void setTakeOff(boolean takeOff) {
		this.takeOff = takeOff;
		if(takeOff) setFlying(true);
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(this.takeOff);
		}
	}

	public boolean isLanding() {
		return landing;
	}

	public void setLanding(boolean landing) {
		this.landing = landing;
		if(landing) setFlying(false);
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

	public boolean isHovering() {
		return isHovering;
	}

	public void setHovering(boolean isHovering) {
		this.isHovering = isHovering;
	}

	public boolean isFlying() {
		return isFlying;
	}

	public void setFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}

}
