package com.associations.one_To_one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Person {
    @Id
    @Column(name = "pId")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
     
    private String name;
    @OneToOne
    @PrimaryKeyJoinColumn
//    @JoinColumn(name = "p_id")
    private Department department;
    
    public Person() {}

    public Person(String name) {
      this.name = name;
    }


    public Department getDepartment() {
      return department;
    }

    public void setDepartment(Department department) {
      this.department = department;
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

    @Override
    public String toString() {
      return "Person [id=" + id + ", name=" + name + "]";
    }

}
