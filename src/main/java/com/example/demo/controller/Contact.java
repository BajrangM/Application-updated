package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data

@Entity
@Table(name="CONTACT_DTLS")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;   
	private String name;
	private String email;
	private long phone;
	private String activeSw;
	
	
	

}
