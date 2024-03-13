package com.associations.one_To_one_bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Account {
    @Id
//    @Column(name = "Acc_id")
    private int id;
    @Column
    private int accountNumber;
    @Column
    private String accountName;
    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "emp_id")
//   / @OneToOne(mappedBy = "account")
    private Employee employee;

    public Account() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Account(int id, int accountNumber, String accountName, Employee employee) {
	super();
	this.id = id;
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
	return "Account [id=" + id + ", accountNumber=" + accountNumber + ", accountName=" + accountName + ", employee="
		+ employee + "]";
    }

}
