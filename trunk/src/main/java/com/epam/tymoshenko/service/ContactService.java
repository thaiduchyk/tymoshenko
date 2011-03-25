package com.epam.tymoshenko.service;

import java.util.List;

import com.epam.tymoshenko.domain.Contact;

public interface ContactService {
	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}
