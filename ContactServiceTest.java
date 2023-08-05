package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import contact.Contact;
import contact.ContactService;

public class ContactServiceTest {

@Test
public void testAdd()
{
ContactService cs = new ContactService();
Contact test1 = new Contact("1928374", "Kenny", "Schrub", "1111111111", "12 Street");
assertEquals(true, cs.addContact(test1));
}

@Test
public void testDelete()
{
   ContactService cs = new ContactService();
     
Contact test1 = new Contact("1928374", "Kenny", "Schrub", "1111111111", "12 Street");
Contact test2 = new Contact("1039172", "Jake", "Yip", "192837183", "Lakehouse");
Contact test3 = new Contact("8374817", "Warren", "Fowler", "8273817381", "Overpass");

cs.addContact(test1);
cs.addContact(test2);
cs.addContact(test3);

assertEquals(true, cs.deleteContact("1039172"));
assertEquals(false, cs.deleteContact("1309404"));
assertEquals(false, cs.deleteContact("1039172"));
}

@Test
public void testUpdate()
{
ContactService cs = new ContactService();
     
Contact test1 = new Contact("1928374", "Kenny", "Schrub", "1111111111", "12 Street");
Contact test2 = new Contact("1039172", "Jake", "Yip", "192837183", "Lakehouse");
Contact test3 = new Contact("8374817", "Warren", "Fowler", "8273817381", "Overpass");

cs.addContact(test1);
cs.addContact(test2);
cs.addContact(test3);

assertEquals(true, cs.updateContact("8374817", "WarrenFirst", "FowlerLast", "8273817381", "Overpass"));
assertEquals(false, cs.updateContact("8374817", "WarrenFirst", "FowlerLast", "8273817381", "Overpass"));
}

}