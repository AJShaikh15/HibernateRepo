package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Student st=new Student();
		st.setSname("Raju");
		st.setSadr("Karve");
		session.save(st);
		session.beginTransaction().commit();
	}
}
