package com.quadromotion.view;

import java.util.Observable;
import java.util.Observer;

import com.quadromotion.controller.Controller;
import com.quadromotion.model.Model;

public class ConsolView implements Observer{
	
	private Model model;
	private Controller controller;
	
	public ConsolView(Model model){
		this.model = model;
		setController(makeController());
		this.model.addObserver(this);
	}
	
	public void printToConsole(String input){
		System.out.println(input);
	}
	
	public Controller makeController(){
		return new Controller(model, this);
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		printToConsole("update view: ");
		
		Model m = (Model) o;
		
	}

}
