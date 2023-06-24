package client;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import model.Department;
import model.Employee;

public class Test {

	public static void main(String[] args) {
		
	
	Configuration cfg=new Configuration();
	cfg.configure();
	Session session = cfg.buildSessionFactory().openSession();
	
	Department hr=new Department();
	hr.setDid(111);
	hr.setDname("HR");
	
	Employee A=new Employee();
	A.setEid(101);
	A.setEname("A");
	A.setD(hr);
	
	Employee B=new Employee();
	B.setEid(102);
	B.setEname("B");
	B.setD(hr);
	
	session.save(A);
	session.save(B);
	session.beginTransaction().commit();
}
}
