package com.associations.one_To_one_bi;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Util.HibernateUtil;

public class TestoneToonebi {
    public static void main(String[] args) {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	
	Employee employee = new Employee();
	employee.setName("Ram");
	employee.setSalary(1233.3);
	
	Account account = new Account();
	account.setId(1);
	account.setAccountName("Saving");
	account.setAccountNumber(12345);
	employee.setAccount(account);
	account.setEmployee(employee);
	
	session.save(employee);
	session.save(account);
	transaction.commit();
	
	session.close();
	
	int accId =account.getId();
	int emId = account.getId();
	sessionFactory.close();
    }

}
