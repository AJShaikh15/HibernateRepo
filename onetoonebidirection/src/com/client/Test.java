package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.PanCard;
import com.model.Person;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
	Session session= cfg.buildSessionFactory().openSession();		

		Person p=new Person();
		p.setPid(11);
		p.setPaddr("Pune");
		p.setPname("Nilesh");
		
		PanCard pc=new PanCard();
		pc.setPanno(101);
		pc.setPantype("xyz");
		
		p.setPan(pc);
		
		
		pc.setPer(p);
		
		session.save(pc);
		session.beginTransaction().commit();
		
		
		
	}
}
