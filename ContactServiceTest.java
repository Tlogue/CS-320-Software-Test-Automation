package contacts.test.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import contacts.model.Contact;
import contacts.service.ContactService;

import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
    private ContactService contactService;

    // Set up a new instance of ContactService before each test
    @BeforeEach
    public void setUp() {
        contactService = new ContactService();
    }

    // Test case for adding a contact and retrieving it
    @Test
    public void testAddContact() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        assertEquals(contact, contactService.getContactById("12345"));
    }

    // Test case for updating contact information
    @Test
    public void testUpdateContact() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        contactService.updateContact("12345", "Jane", null, null, "456 Oak St");
        assertEquals("Jane", contactService.getContactById("12345").getFirstName());
        assertEquals("Doe", contactService.getContactById("12345").getLastName());
        assertEquals("1234567890", contactService.getContactById("12345").getPhone());
        assertEquals("456 Oak St", contactService.getContactById("12345").getAddress());
    }

    // Add more tests based on ContactService class requirements
}
