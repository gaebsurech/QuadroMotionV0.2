package com.quadromotion.model;

import java.util.Observable;

import com.quadromotion.model.convertion.AngleToSpeedConverter;

public class Model extends Observable {

	private double speedX;
	private double speedY;
	private double speedZ;
	private double speedSpin;
	private boolean takeOffCommand;
	private boolean landingCommand;
	private boolean hoverCommand;
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
		this.takeOffCommand = false;
		this.landingCommand = false;
		this.hoverCommand = false;
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
		return takeOffCommand;
	}

	public void setTakeOffCommand(boolean command) {
		this.takeOffCommand = command;
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(this.takeOffCommand);
		}
		if(command) isFlying = true;
	}

	public boolean isLanding() {
		return landingCommand;
	}

	public void setLandingCommand(boolean command) {
		this.landingCommand = command;
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(this.landingCommand);
		}
		if(command) isFlying = false;
	}

	public boolean getHoverCommand() {
		return hoverCommand;
	}

	public void setHoverCommand(boolean command) {
		this.hoverCommand = command;
		if (countObservers() > 0) {
			setChanged();
			notifyObservers(this.hoverCommand);
		}
	}

	public boolean isHovering() {
		return isHovering;
	}

	public boolean isFlying() {
		return isFlying;
	}

	public boolean isConnected() {
		return isConnected;
	}
}
