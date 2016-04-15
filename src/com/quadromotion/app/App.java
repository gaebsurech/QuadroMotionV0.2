package com.quadromotion.app;

import com.quadromotion.boot.Boot;
import com.quadromotion.controller.Controller;
import com.quadromotion.model.Model;
import com.quadromotion.view.ConsolView;

public class App {

	boolean run = false;
	static Controller controller = null;
	static Model model = null;
	static Boot boot = null;
	static ConsolView view = null;
	
	public void boot() {
		// TODO Auto-generated method stub
		boot = new Boot();
		model = boot.getModel();
		controller = boot.getController();
		view = boot.getView();
		view.printToConsole("Boot done...");
	}

	public void run(){
		
		view.printToConsole("run...");
			// TODO State machine implementieren
		
		while(run){
			
			controller.countObservers();
			controller.setSpeed(Math.random());
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){}
			
		}
	}
	
	public void cleanup(){
		view.printToConsole("cleanup...");
		model = null;
		controller = null;
		view = null;
	}
}
