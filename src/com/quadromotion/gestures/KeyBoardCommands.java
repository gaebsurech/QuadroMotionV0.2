package com.quadromotion.gestures;

import com.quadromotion.controller.Controller;

public class KeyBoardCommands implements IGestures{
	
	Controller controller = null;
	
	public KeyBoardCommands(){
		
	}
	
	public KeyBoardCommands(Controller controller){
		this.controller = controller;
	}

	

	

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}
}
