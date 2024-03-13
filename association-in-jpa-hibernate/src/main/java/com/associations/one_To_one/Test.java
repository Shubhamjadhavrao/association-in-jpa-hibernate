package com.associations.one_To_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Util.HibernateUtil;

public class Test {
    public static void main(String[] args) {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	
	Student student = new Student();
	student.setName("Raj");
	
	Address address = new Address();
	
	address.setAddressName("nasik");
	
	student.setAddress(address);
	address.setStudent(student);
	
	session.save(student);
	session.save(address);
	transaction.commit();
	session.close();
//	sessionFactory.close();
    }

}
