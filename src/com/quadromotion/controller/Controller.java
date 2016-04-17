package com.quadromotion.controller;

import java.util.Observable;
import java.util.Observer;

import javax.jws.WebParam.Mode;

import com.quadromotion.communication.Communication;
import com.quadromotion.gestures.KeyBoardCommands;
import com.quadromotion.model.Model;
import com.quadromotion.view.ConsolView;

public class Controller implements IController, Observer {

	float speedX;
	float speedY;
	float speedZ;
	float speedSpin;
	boolean takeOff;
	boolean landing;
	boolean hover;

	private KeyBoardCommands gestures = null;
	private Communication com = null;
	private Model model = null;
	private ConsolView consolView = null;
	
	/**
	 * Constructor I
	 * @param model the model
	 * @param consolView the view
	 */
	public Controller(Model model, ConsolView consolView) {
		speedX = 0;
		speedY = 0;
		speedZ = 0;
		speedSpin = 0;
		takeOff = false;
		landing = false;
		hover = false;
		this.setModel(model);
		this.consolView = consolView;
		//setCom(new Communication(model));
		//gestures = new KeyBoardCommands();
		//model.addObserver(this);
	}

	public void sendCommands() {
		// com.moveDrone(speedX, speedY, speedZ, speedSpin);
	}

	public void countObservers() {
		consolView.printToConsole("countObserver: " + String.valueOf(model.countObservers()));
		consolView.printToConsole("changed: " + String.valueOf(model.hasChanged()));
		consolView.printToConsole("speed: " + String.valueOf(model.getxSpeed()));
	}

	public float getSpeedX() {
		return speedX;
	}

	public void setSpeedX(float speedX) {
		this.speedX = speedX;
	}

	public float getSpeedY() {
		return speedY;
	}

	public void setSpeedY(float speedY) {
		this.speedY = speedY;
	}

	public float getSpeedZ() {
		return speedZ;
	}

	public void setSpeedZ(float speedZ) {
		this.speedZ = speedZ;
	}

	public float getSpeedSpin() {
		return speedSpin;
	}

	public void setSpeedSpin(float speedSpin) {
		this.speedSpin = speedSpin;
	}

	public boolean isTakeOff() {
		return takeOff;
	}

	public void setTakeOff(boolean takeOff) {
		this.takeOff = takeOff;
	}

	public boolean isLanding() {
		return landing;
	}

	public void setLanding(boolean landing) {
		this.landing = landing;
	}

	public boolean isHover() {
		return hover;
	}

	public void setHover(boolean hover) {
		this.hover = hover;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		consolView.printToConsole("update controller: ");
		Model m = (Model) o;
		
		if (m.getxSpeed() != this.getSpeedX()) {
			this.setSpeedX(m.getxSpeed());
			consolView.printToConsole("update speedX: " + arg.toString());
		} else if (m.getySpeed() != this.getSpeedY()) {
			this.setSpeedY(m.getySpeed());
			consolView.printToConsole("update speedY: " + arg.toString());
		}
		
	}

	public KeyBoardCommands getGestures() {
		return gestures;
	}

	public void setGestures(KeyBoardCommands gestures) {
		this.gestures = gestures;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public ConsolView getView() {
		return consolView;
	}

	public void setView(ConsolView view) {
		this.consolView = view;
	}

	/**
	 * Gets the communication
	 * @return communication
	 */
	public Communication getCom() {
		return com;
	}

	/**
	 * 
	 * @param com
	 */
	public void setCom(Communication com) {
		this.com = com;
	}

}
