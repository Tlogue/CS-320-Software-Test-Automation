package contacts.test.model;

import org.junit.jupiter.api.Test;

import contacts.model.Contact;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    // Test case for creating a new contact
    @Test
    public void testContactCreation() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertNotNull(contact);
        assertEquals("12345", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    // Test cases for handling invalid input data
    @Test
    public void testInvalidFirstName() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345", "John12345678", "Doe", "1234567890", "123 Main St"));
    }

    @Test
    public void testInvalidLastName() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345", "John", "Doe12345678", "1234567890", "123 Main St"));
    }

    @Test
    public void testInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345", "John", "Doe", "12345678901", "123 Main St"));
    }

    @Test
    public void testInvalidAddress() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345", "John", "Doe", "1234567890", "123 Main St123456789012345678901234567890"));
    }
}
