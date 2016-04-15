package com.quadromotion.model;

import java.util.Observable;

public class Model extends Observable{

	float xSpeed;
	float ySpeed;
	float zSpeed;
	float spinSpeed;
	boolean takeOff;
	boolean landing;
	boolean hover;
	boolean isFlying;
	boolean isHovering;
	boolean isConnected;
	boolean oneHandControl;
	
	public Model(){
		
		super();
		this.xSpeed = 0;
		this.ySpeed = 0;
		this.zSpeed = 0;
		this.spinSpeed = 0;
		this.takeOff = false;
		this.landing = false;
		this.hover = false;
		this.isFlying = false;
		this.isHovering = false;
		this.isConnected = false;
		this.oneHandControl = false;
	}
	
	public float getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(float speed) {
		this.xSpeed = speed;
		if(countObservers()>0){
			setChanged();
			notifyObservers(speed);
		}
	}

	public float getySpeed() {
		return ySpeed;
	}

	public void setySpeed(float speed) {
		this.ySpeed = speed;
		if(countObservers()>0){
			setChanged();
			notifyObservers(speed);
		}
	}

	public float getzSpeed() {
		return zSpeed;
	}

	public void setzSpeed(float speed) {
		this.zSpeed = speed;
		if(countObservers()>0){
			setChanged();
			notifyObservers(speed);
		}
	}

	public float getSpinSpeed() {
		return spinSpeed;
	}

	public void setSpinSpeed(float speed) {
		this.spinSpeed = speed;
		if(countObservers()>0){
			setChanged();
			notifyObservers(speed);
		}
	}

	public boolean isTakeOff() {
		return takeOff;
	}

	public void setTakeOff(boolean takeOff) {
		this.takeOff = takeOff;
		if(countObservers()>0){
			setChanged();
			notifyObservers(takeOff);
		}
	}

	public boolean isLanding() {
		return landing;
	}

	public void setLanding(boolean landing) {
		this.landing = landing;
		if(countObservers()>0){
			setChanged();
			notifyObservers(landing);
		}
	}

	public boolean isHover() {
		return hover;
	}

	public void setHover(boolean hover) {
		this.hover = hover;
		if(countObservers()>0){
			setChanged();
			notifyObservers(hover);
		}
	}

}
