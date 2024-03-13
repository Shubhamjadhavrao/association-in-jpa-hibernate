package com.associations.one_To_many;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int accountNumber;
    @Column
    private String accountName;
    @ManyToOne
    private Employee employee;
    

    public Account() {
	super();
	
    }

    

    public Account(int accountNumber, String accountName, Employee employee) {
	super();
	this.accountNumber = accountNumber;
	this.accountName = accountName;
	this.employee = employee;
    }



    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public int getAccountNumber() {
	return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
    }

    public String getAccountName() {
	return accountName;
    }

    public void setAccountName(String accountName) {
	this.accountName = accountName;
    }

    public Employee getEmployee() {
        return employee;
    }



    public void setEmployee(Employee employee) {
        this.employee = employee;
    }



    @Override
    public String toString() {
	return "Account [id=" + id + ", accountNumber=" + accountNumber + ", accountName=" + accountName + "]";
    }

}
