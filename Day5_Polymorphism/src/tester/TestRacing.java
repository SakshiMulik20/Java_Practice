package tester;

import myapplication.BMW;
import myapplication.Ferrari;
import myapplication.Nano;

public class TestRacing {

	public static void main(String[] args) {
		
		Nano nano = new Nano();
		nano.speed();
		nano.safety();
		
		BMW bmw = new BMW();
		bmw.speed();
		bmw.safety();
		
		Ferrari fr= new Ferrari();
		fr.speed();
		fr.safety();
	}

}
