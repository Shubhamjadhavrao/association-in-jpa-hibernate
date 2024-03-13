package com.associations.one_To_one_bi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Employee {
    @Id
//    @Column(name = "Emp_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String Name;
    @Column
    private double salary;
    @OneToOne
    @JoinColumn(name = "Acc_id")
//    @PrimaryKeyJoinColumn
    private Account account;

    public Employee() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Employee(String name, double salary, Account account) {
	super();
	Name = name;
	this.salary = salary;
	this.account = account;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return Name;
    }

    public void setName(String name) {
	Name = name;
    }

    public double getSalary() {
	return salary;
    }

    public void setSalary(double salary) {
	this.salary = salary;
    }

    public Account getAccount() {
	return account;
    }

    public void setAccount(Account account) {
	this.account = account;
    }

    @Override
    public String toString() {
	return "Employee [id=" + id + ", Name=" + Name + ", salary=" + salary + "]";
    }

}
