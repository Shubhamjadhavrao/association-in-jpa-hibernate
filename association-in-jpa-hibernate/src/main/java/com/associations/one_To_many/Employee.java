package com.associations.one_To_many;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private double salary;
    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
//    @JoinTable(name = "Emp_id")
    private Set<Account>account;
    
    public Employee() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Employee(String name, double salary, Set<Account> account) {
	super();
	this.name = name;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<Account> getAccount() {
        return account;
    }

    public void setAccount(Set<Account> account) {
        this.account = account;
    }

    @Override
    public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", account=" + account + "]";
    }
    
    
    
    

}
