package com.quadromotion.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DateFormat.Field;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.quadromotion.controller.Controller;
import com.quadromotion.model.Model;

public class ConsolView extends JFrame implements Observer, KeyListener {

	private float speed = 15;
	private Model model;
	private Controller controller;
	JLabel label;
	int c = 0;

	public ConsolView(Model model) {
		this.setLayout(new BorderLayout());
		//JTextField field = new JTextField();
		label = new JLabel("QuadroMotion");
		label.addKeyListener(this);
		//field.addKeyListener(this);
		this.addKeyListener(this);
		this.add(label, BorderLayout.CENTER);
		//this.add(field, BorderLayout.SOUTH);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new FlowLayout());
		this.setBounds(200,100,800,600);
		this.setVisible(true);

		this.model = model;
		setController(makeController());
		this.model.addObserver(this);
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
		 label.setText("X Speed: "+ m.getxSpeed() + "; "+c);
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
			if(!controller.isTakeOff()) {
				controller.setTakeOff(true);
				System.out.println("start");
			
			}
			
			break;
		case KeyEvent.VK_SPACE:
			System.out.println("land");
			model.setLanding(true);
			break;
		case KeyEvent.VK_LEFT:
			model.setxSpeed(model.convert(-speed));
			break;
		case KeyEvent.VK_RIGHT:
			model.setxSpeed(speed);
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
			if(!controller.isTakeOff()) {
				controller.setTakeOff(true);
				System.out.println("start");
			
			}
			
			break;
		case KeyEvent.VK_SPACE:
			System.out.println("land");
			
			break;
		case KeyEvent.VK_LEFT:
			model.setxSpeed(0);
			//label.setText(String.valueOf(model.convert(0)));
			break;
		case KeyEvent.VK_RIGHT:
			model.setxSpeed(0);
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
