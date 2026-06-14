package com.provider;

import com.contracts.Sim;

public class Jio implements Sim {

	@Override
	public void calling() {
		System.out.println("Jio calling");
	}

	@Override
	public void msging() {
		System.out.println("Jio msging");
		
	}

}
