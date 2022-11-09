package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Service;




@Service
public interface ContactService {
	String upsert (Contact contact);  

	List<Contact> getAllContacts( );

	Contact getContact (int cid);

	String deleteContact (int cid);

}
