package com.quadromotion.app;

public class QuadroMotion {

	static App app = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		app = new App();
		app.boot();
		app.run = true;
		app.run();

		try{
			System.in.read();
			app.run = false;
			System.out.println("stopping...");
			
		} catch(Exception e){
			System.out.println("error...");
		}
		finally{
			app.cleanup();
			System.exit(0);
		}
	}

}
