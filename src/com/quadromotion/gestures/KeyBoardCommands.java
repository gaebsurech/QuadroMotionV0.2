package com.quadromotion.gestures;

import com.quadromotion.controller.Controller;

public class KeyBoardCommands implements IGestures{
	
	Controller controller = null;
	
	public KeyBoardCommands(){
		
	}
	
	public KeyBoardCommands(Controller controller){
		this.controller = controller;
	}

	

	@Override
	public void getSpeedX() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float setSpeedY(float speedY) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getSpeedY() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float setSpeedZ(float speedZ) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getSpeedZ() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float setSpeedSpin(float speedSpin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getSpeedSpin() {
		// TODO Auto-generated method stub
		
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	@Override
	public float setSpeedX(float speedX) {
		// TODO Auto-generated method stub
		return 0;
	}

}
