package com.quadromotion.controller;

import com.quadromotion.gestures.KeyBoardCommands;
import com.quadromotion.model.Model;
import com.quadromotion.view.ConsolView;

public class Controller {

	private Model model = null;
	private ConsolView consolView = null;
	private KeyBoardCommands gestures = null;
	
	
	/**
	 * Constructor I
	 * @param model the model
	 * @param consolView the view
	 */
	public Controller() {
		
		this.model = new Model();
		this.consolView = new ConsolView(model);
	}
	
	/**
	 * Constructor II
	 * @param model the model
	 * @param consolView the view
	 */
	public Controller(Model model) {
		
		this.setModel(model);
		this.consolView = new ConsolView(model);
	}
	
	/**
	 * Constructor III
	 * @param model the model
	 * @param consolView the view
	 */
	public Controller(Model model, ConsolView consolView) {
		
		this.setModel(model);
		this.consolView = consolView;
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
}
