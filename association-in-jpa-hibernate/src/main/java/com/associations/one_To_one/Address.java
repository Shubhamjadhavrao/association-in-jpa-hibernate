package com.associations.one_To_one;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String addressName;
    @OneToOne(mappedBy = "address")
    private Student student;

    public Address() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Address( String addressName, Student student) {
	super();
		this.addressName = addressName;
	this.student = student;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getAddressName() {
	return addressName;
    }

    public void setAddressName(String addressName) {
	this.addressName = addressName;
    }

    public Student getStudent() {
	return student;
    }

    public void setStudent(Student student) {
	this.student = student;
    }

}
