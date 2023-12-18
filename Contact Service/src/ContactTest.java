import static org.junit.Assert.assertEquals;
import static org.junit.Assertions.*;

import org.junit.Test;

public class ContactTest {

	@Test
	public void testContact() {
		Contact contact = Contact("2321345678", "Jack", "McDonald", "2321345678", "232 Main St");
		assertEquals("2321345678", contact.getContactId());
		assertEquals("Jack", contact.getContactId());
		assertEquals("Mcdonald", contact.getLastName());
		assertEquals("2321345678", contact.getPhone());
		assertEquals("232 Main St", contact.getAddress());
	}
 
}
