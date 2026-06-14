package com.consumer;

import com.contracts.Sim;
import com.provider.*;

public class TestServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Idea idea = new Idea();
		idea.calling();
		idea.msging();
		
		System.out.println();
		
		Jio jio = new Jio();
		jio.calling();
		jio.msging();
		addSimInMobile(idea);
		addSimInMobile(jio);
		//same for BSNL
	}
	public static void addSimInMobile(Sim simobj) {
		System.out.println("Sim added in mobile is :" + simobj.getClass());
	}

}\
