package com.example.PhoneKart.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
@Table(name="members")
public class Members {

	  	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	  	@Column(name="full_name")
	    private String full_name;
	  	
	  	@Column(name="gender")
	    private String gender;
	  	
	  	@Column(name="contact_number")
	    private String contact_number;
	  	
	 
		@Column(name="email")
	    private String email;
	    
		@Column(name="Age")
	    private int age;
	    
		
	    public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public Members() {};
	    
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFull_name() {
			return full_name;
		}
		public void setFull_name(String full_name) {
			this.full_name = full_name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getContact_number() {
			return contact_number;
		}
		public void setContact_number(String contact_number) {
			this.contact_number = contact_number;
		}
		
		
	 	@Override
			public String toString() {
				return "Members [id=" + id + ", full_name=" + full_name + ", gender=" + gender + ", contact_number="
						+ contact_number + ", email=" + email + ", getId()=" + getId() + ", getFull_name()="
						+ getFull_name() + ", getGender()=" + getGender() + ", getContact_number()=" + getContact_number()
						+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
						+ "]";
			}
}
