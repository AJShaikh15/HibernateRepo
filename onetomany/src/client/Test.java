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
		
		Employee e1=new Employee();
		e1.setEid(111);
		e1.setEname("Radhe");
		e1.setEaddr("Mumbai");
		
		Employee e2=new Employee();
		e2.setEid(222);
		e2.setEname("Vinod");
		e2.setEaddr("Nagpur");
		
		Employee e3=new Employee();
		e3.setEid(333);
		e3.setEname("Shyam");
		e3.setEaddr("Pune");
		
		Department hr=new Department();
		hr.setDid(1);
		hr.setDname("HR DepartMent");
		hr.setDaddr("Karve");
		hr.getE().add(e1);
		hr.getE().add(e2);
		hr.getE().add(e3);
		
		session.save(hr);
		session.beginTransaction().commit();
		
		
	}
}
