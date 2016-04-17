package com.quadromotion.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DateFormat.Field;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.quadromotion.controller.Controller;
import com.quadromotion.gestures.KeyBoardCommands;
import com.quadromotion.model.Model;

public class ConsolView extends JFrame implements Observer, KeyListener {

	private float speed = 15;
	private Model model;
	private Controller controller;
	private Object gestures;
	JLabel labelTitle;
	JLabel labelLeft;
	JLabel labelRight;
	JLabel labelForward;
	JLabel labelBackward;
	int c = 0;

	/**
	 * Constructor I
	 * @param model
	 */
	public ConsolView(Model model) {
		createView();
		
		this.model = model;
		setController(makeController());
		this.model.addObserver(this);
	}
	
	/**
	 * Constructor I
	 * @param model
	 */
	public ConsolView(Model model, String gestureType) {
		createView();
		this.model = model;
		setController(makeController());
		this.model.addObserver(this);
	}

	private void createView(){
		this.setLayout(new BorderLayout());
		
		//JTextField field = new JTextField();
		//field.addKeyListener(this);
		//this.add(field, BorderLayout.SOUTH);
		labelTitle = new JLabel("QuadroMotion");
		labelTitle.addKeyListener(this);
		this.addKeyListener(this);
		this.add(labelTitle, BorderLayout.CENTER);
		
		labelLeft = new JLabel("Left: ");
		this.add(labelLeft, BorderLayout.SOUTH);

		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new FlowLayout());
		this.setBounds(200,100,800,600);
		//this.setVisible(true);
	}
	
	public void printToConsole(String input) {
		System.out.println(input);
	}

	public Controller makeController() {
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
		c++;
		Model m = (Model) o;
		 labelTitle.setText("X Speed: "+ m.getSpeedX() + "; "+c);
 	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int keyCode = e.getKeyCode();
		switch (keyCode) {
		case KeyEvent.VK_ENTER:
			if(!model.isTakeOff()) {
				model.setTakeOff(true);
				System.out.println("start");
			
			}
			
			break;
		case KeyEvent.VK_SPACE:
			System.out.println("land");
			model.setLanding(true);
			break;
		case KeyEvent.VK_LEFT:
			controller.setSpeedX(-speed);
			break;
		case KeyEvent.VK_RIGHT:
			model.setSpeedX(speed);
			break;
		case KeyEvent.VK_UP:
			System.out.println("foreward");
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("backwards");
			break;
		case KeyEvent.VK_A:
			System.out.println("turncounterclockwise");
			break;
		case KeyEvent.VK_D:
			System.out.println("turnclockwise");
			break;
		case KeyEvent.VK_W:
			System.out.println("up");
			break;
		case KeyEvent.VK_S:
			System.out.println("down");
			break;
		case KeyEvent.VK_ESCAPE:
			System.out.println("exit");
		default:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int keyCode = e.getKeyCode();
		
		switch (keyCode) {
		case KeyEvent.VK_ENTER:
			if(!model.isTakeOff()) {
				model.setTakeOff(true);
				System.out.println("start");
			
			}
			
			break;
		case KeyEvent.VK_SPACE:
			System.out.println("land");
			
			break;
		case KeyEvent.VK_LEFT:
			controller.setSpeedX(0);
			break;
		case KeyEvent.VK_RIGHT:
			model.setSpeedX(0);
			break;
		case KeyEvent.VK_UP:
			System.out.println("foreward");
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("backwards");
			break;
		case KeyEvent.VK_A:
			System.out.println("turncounterclockwise");
			break;
		case KeyEvent.VK_D:
			System.out.println("turnclockwise");
			break;
		case KeyEvent.VK_W:
			System.out.println("up");
			break;
		case KeyEvent.VK_S:
			System.out.println("down");
			break;
		case KeyEvent.VK_ESCAPE:
			System.out.println("exit");
		default:
			break;
		}
	}
}
