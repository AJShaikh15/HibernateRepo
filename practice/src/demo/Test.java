package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory bsf = cfg.buildSessionFactory();
		Session session = bsf.openSession();
		Student st=new Student();
		st.setSaddr("Pune");
		st.setSname("Nilesh");
		session.save(st);
		session.beginTransaction().commit();
		
		
	}
}
