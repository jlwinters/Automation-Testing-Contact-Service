package test;
import org.junit.jupiter.api.Test;

import contact.Contact;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    Contact contact = new Contact("1", "firstName", "lastName", "123456789", "test");

    @Test
    void getContactID() {
        assertEquals("1", contact.getContactID());
    }

    @Test
    void getFirstName() {
        assertEquals("firstName", contact.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("lastName", contact.getLastName());
    }

    @Test
    void getPhoneNumber() {
        assertEquals("123456789", contact.getPhoneNumber());
    }

    @Test
    void getAddress() {
        assertEquals("test", contact.getAddress());
    }

    @Test
    void testToString() {
        assertEquals("Contact [contactID=1, firstName=firstName, lastName=lastName, phoneNumber=123456789, address=test]", contact.toString());
    }

}