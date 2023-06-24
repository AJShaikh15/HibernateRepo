package client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Address;
import model.Student;

public class Test {

	
	Scanner sc=new Scanner(System.in);
	public static Session getsession()
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
	
	public void insertdata()
	{
		Session session = Test.getsession();
		
		Address adr=new Address();
		adr.setPincode(101);
		adr.setCname("Pune");
		
		Student stu=new Student();
		stu.setSid(1);
		stu.setSname("Abc");
		stu.setSaddr("mumbai");
		stu.setAdr(adr);
			
		session.save(stu);
		
		session.beginTransaction().commit();
	}
	
	public void getrecord()
	{
			Session session = Test.getsession();
			System.out.println("Enter Student ID");
			int id=sc.nextInt();
			
				Student st = session.get(Student.class,id);
				System.out.println(st.getSid());
				System.out.println(st.getSname());
				System.out.println(st.getSaddr());
	}
	public void updaterecord()
	{
				Session session = Test.getsession();
			System.out.println("enter id");
			int id=sc.nextInt();
			Student st = session.get(Student.class,id);
			System.out.println("1)for update name \n 2)for update address");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
					System.out.println("Enter new Name");
					st.setSname(sc.next());
					session.update(st);
					session.beginTransaction().commit();
					break;
			case 2:
				System.out.println("Enter new Address");
				st.setSaddr(sc.next());
				session.update(st);
				session.beginTransaction().commit();
				break;
			}
	}
	public void deleterecord()
	{
		Session session = Test.getsession();
		System.out.println("Enter delete student id");
		Student st = session.get(Student.class,sc.nextInt());
		session.delete(st);
		session.beginTransaction().commit();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1)For Add record\n 2)For Get Record \n 3)For Update Record \n 4)For Delete record \n 5)For exit");
		int ch=sc.nextInt();
		Test t=new Test();
		switch(ch)
		{
		case 1:
				t.insertdata();
				break;
		case 2:
			t.getrecord();
			break;
		case 3:
			t.updaterecord();
			break;
		case 4:
			t.deleterecord();
			break;
		}
		
		
	}
}
