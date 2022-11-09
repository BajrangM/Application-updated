package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pro")
public class viewController {

	@Autowired
	private ContactServiceImpl contactServiceImpl;

	@GetMapping("/msg")
	public String getMsg() {
		return "Connected.....";
	}

	@PostMapping("/Contact1")
	public ResponseEntity<String> contact(@RequestBody Contact contact) {
		System.out.println("in....");
		String status = contactServiceImpl.upsert(contact);
		return new ResponseEntity<>("status", HttpStatus.CREATED);
	}

	@GetMapping("/Contact1")
	public ResponseEntity<List<Contact>> getAllContacts() {
		List<Contact> allContact = contactServiceImpl.getAllContacts();
		return new ResponseEntity<>(allContact, HttpStatus.OK);
	}

	@GetMapping("/Contact3/{cid}")
	public ResponseEntity<Contact> getContact(@PathVariable int cid) {
		Contact contact = contactServiceImpl.getContact(cid);
		return new ResponseEntity<>(contact, HttpStatus.OK);
	}

	@DeleteMapping("/Contact4/{cid}")
	public ResponseEntity<String> deletContact(@PathVariable int cid) {
		String deleteContact = contactServiceImpl.deleteContact(cid);
		return new ResponseEntity<>(deleteContact, HttpStatus.OK);
	}

}
