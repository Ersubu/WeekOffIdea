package com.surya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya.dto.ContactFormDto;
import com.surya.model.ContactForm;
import com.surya.repo.ContactRepo;

@Service
public class ContactService {
	@Autowired
	private ContactRepo repo;

    public void submitContactForm(ContactFormDto contactForm) {
    	
    	ContactForm cont=new ContactForm();
    	
    	cont.setName(contactForm.getName());
    	cont.setEmail(contactForm.getEmail());
    	cont.setMessage(contactForm.getMessage());
    	repo.save(cont);
    }
}