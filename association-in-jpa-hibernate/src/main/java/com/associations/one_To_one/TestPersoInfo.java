package com.associations.one_To_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Util.HibernateUtil;

public class TestPersoInfo {
    public static void main(String[] args) {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	
	Person p = new Person("Ram");
	
	Department d = new Department();
	d.setName("IT");
	p.setDepartment(d);
	d.setPerson(p);
	
	session.save(p);
	session.save(d);
	
	 transaction.commit();
	 SessionFactory sessionFactory2 = HibernateUtil.getSessionFactory();
		Session session2 = sessionFactory.openSession();
	 int pId = p.getId();
	 
	Person p1 = (Person)session.get(Person.class, pId);
	System.out.println(p1.getName());
	System.out.println(p1.getDepartment());
	 
	 
	 session.close();
	
	
    }

}
