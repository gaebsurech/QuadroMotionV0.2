package com.quadromotion.boot;

import com.quadromotion.communication.Communication;
import com.quadromotion.controller.Controller;
import com.quadromotion.gestures.KeyBoardCommands;
import com.quadromotion.model.Model;
import com.quadromotion.view.ConsolView;

public class Boot {
	
	Controller controller = null;
	Model model = null;
	Communication droneCommunication = null;
	KeyBoardCommands gestures = null;
	ConsolView view = null;
	
	public Boot(){
		initialize();
	}
	
	public Boot(KeyBoardCommands kbc){
		gestures = kbc;
	}

	private void initialize(){
		model = new Model();
		view = new ConsolView(model);
		//droneCommunication = new Communication();
		//gestures = new KeyBoardCommands();
		controller = view.getController();
	}
	
	public void run(){
		
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Communication getDroneCommunication() {
		return droneCommunication;
	}

	public void setDroneCommunication(Communication droneCommunication) {
		this.droneCommunication = droneCommunication;
	}

	public KeyBoardCommands getGestures() {
		return gestures;
	}

	public void setGestures(KeyBoardCommands gestures) {
		this.gestures = gestures;
	}

	public ConsolView getView() {
		return view;
	}

	public void setView(ConsolView view) {
		this.view = view;
	}
	
}
