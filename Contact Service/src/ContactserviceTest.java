import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assertions.*;

import org.junit.Test;

public class ContactserviceTest {

	@Test
	public void testContactservice() {
		ContactService contactservice = new ContactService();
		
		Contact contact = new Contact("2321345678", "Jack", "McDonald", "2321345678", "232 Main St");
		contactService.addContact(contact);
		Contact retrievedContact = contactService.getContact("2321345678");
		assertNotNull(retrievedContact);
		assertEquals("Jack", retrievedContact.getFirstName());
		contactService.updateFirstName("2321345678", "James");
		retrievedContact = contactService.getContact("2321345678");
		assertNotNull(retrievedContact);
		assertEquals("James", retrievedContact.getFirstName());
		contactService.deleteContact("2321345678");
		assertNull(contactService.getContact("2321345678"));
	}

}
