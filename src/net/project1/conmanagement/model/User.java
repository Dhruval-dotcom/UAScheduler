package net.project1.conmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User.java
 * This is a model class represents a User entity
 * @author Ramesh Fadatare
 *
 */

@Entity
@Table(name="reg")
public class User {
 
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 @Column(name="id")
 protected int id;
 
 @Column(name="time")
 protected String time;
 
 @Column(name="act")
 protected String act;
 
 
 public User() {
 }
 
 public User(String time, String act) {
  super();
  this.time = time;
  this.act = act;
  
 }

 public User(int id, String time, String act) {
  super();
  this.id = id;
  this.time = time;
  this.act = act;
  
 }

 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
}
 
 public String getTime() {
  return time;
 }
 public void setTime(String time) {
  this.time = time;
}
 public String getAct() {
  return act;
}
	 
 public void setAct(String act) {
  this.act = act;
 }
 
}
