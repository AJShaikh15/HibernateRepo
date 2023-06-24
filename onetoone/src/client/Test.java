package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Address;
import model.Employee;

public class Test {

	public static void main(String[] args) {
		

	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			Address adr=new Address();
			adr.setPincode(101);
			adr.setCityname("Pune");
			
			Employee emp=new Employee();
			emp.setEid(1);
			emp.setEname("Nilesh");
			emp.setAdr(adr);
			session.save(emp);
			session.beginTransaction().commit();
	
	}	
}
