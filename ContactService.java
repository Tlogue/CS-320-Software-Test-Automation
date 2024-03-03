package contacts.service;

import java.util.HashMap;
import java.util.Map;
import contacts.model.Contact;

public class ContactService {
    // A service class to manage contacts using a HashMap
    private final Map<String, Contact> contacts;

    // Constructor to initialize the HashMap
    public ContactService() {
        this.contacts = new HashMap<>();
    }

    // Method to add a new contact
    public void addContact(Contact contact) {
        if (contact != null && !contacts.containsKey(contact.getContactId())) {
            contacts.put(contact.getContactId(), contact);
        }
    }

    // Method to delete a contact by ID
    public void deleteContact(String contactId) {
        contacts.remove(contactId);
    }

    // Method to update contact information
    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        if (contacts.containsKey(contactId)) {
            Contact contact = contacts.get(contactId);

            // Use setter methods to ensure field-specific validation
            contact.setFirstName(firstName);

            if (lastName != null) {
                contact.setLastName(lastName);
            }

            if (phone != null) {
                contact.setPhone(phone);
            }

            contact.setAddress(address);
        }
    }

    // Method to retrieve a contact by ID
    public Contact getContactById(String contactId) {
        return contacts.get(contactId);
    }
}
