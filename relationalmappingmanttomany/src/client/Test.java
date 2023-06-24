package client;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import model.Course;
import model.Student;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		Session session = cfg.buildSessionFactory().openSession();
		
		Student A=new Student();
		A.setSid(1);
		A.setSname("A");
		
		Student B=new Student();
		B.setSid(2);
		B.setSname("B");
		
		Course JAVA=new Course();
		JAVA.setCid(101);
		JAVA.setCourseName("JAVA");
		
		Course python=new Course();
		python.setCid(102);
		python.setCourseName("Python");
		
		A.getC().add(JAVA);
		A.getC().add(python);
		B.getC().add(python);
		session.save(A);
		session.save(B);
		session.beginTransaction().commit();
		
	}
}
