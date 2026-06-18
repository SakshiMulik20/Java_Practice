package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibUtil {
	
	public static SessionFactory getSessionFactory() {
		
		Configuration config=new Configuration().configure();
		System.out.println("--sonfig file get load---");
		
		
		
		SessionFactory sf=config.buildSessionFactory();
		System.out.println("--sf created--");
		
		return sf;
	}
	

}
