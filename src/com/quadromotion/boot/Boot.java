package com.quadromotion.boot;

import com.quadromotion.controller.ARDroneController;
import com.quadromotion.controller.Controller;
import com.quadromotion.gestures.KeyBoardCommands;
import com.quadromotion.model.Model;
import com.quadromotion.view.ConsolView;

public class Boot {
	
	Controller controller = null;
	Model model = null;
	ARDroneController droneCommunication = null;
	ConsolView view = null;
	
	public Boot(){
		initialize();
	}

	private void initialize(){
		model = new Model();
		view = new ConsolView(model);
		//droneCommunication = new Communication();
		//gestures = new KeyBoardCommands();
		controller = view.getController();
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

	public ARDroneController getDroneCommunication() {
		return droneCommunication;
	}

	public void setDroneCommunication(ARDroneController droneCommunication) {
		this.droneCommunication = droneCommunication;
	}

	public ConsolView getView() {
		return view;
	}

	public void setView(ConsolView view) {
		this.view = view;
	}
}
