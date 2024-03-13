package com.associations;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Util.HibernateUtil;
import com.associations.one_To_many.Account;
import com.associations.one_To_many.Employee;

public class one_To_manyTest {
    public static void main(String[] args) {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	
	Account account1= new Account();
	account1.setAccountName("saving...");
	account1.setAccountNumber(1111);
	
	Account account2= new Account();
	account2.setAccountName("Dmat...");
	account2.setAccountNumber(2222);
	
	
	Account account3= new Account();
	account3.setAccountName("salary...");
	account3.setAccountNumber(3333);
	
	
	Set<Account> acc = new HashSet<Account>();
	acc.add(account1);
	acc.add(account2);
	acc.add(account3);
	
	
	
	Employee employee = new Employee();
	employee.setName("Krishna");
	employee.setSalary(12424);
	employee.setAccount(acc);
	account1.setEmployee(employee);
	account2.setEmployee(employee);
	account3.setEmployee(employee);
	
	
	

	
	session.persist(employee);
	session.persist(account1);
	session.persist(account2);
	session.persist(account3);
	transaction.commit();
	session.close();
	
	
	
    }

}
