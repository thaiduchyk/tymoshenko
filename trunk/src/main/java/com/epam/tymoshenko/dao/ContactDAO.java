package com.epam.tymoshenko.dao;

import java.util.List;

import com.epam.tymoshenko.domain.Contact;

public interface ContactDAO {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}