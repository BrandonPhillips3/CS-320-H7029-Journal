import java.util.HashMap;
import java.util.Map;


public class Contactservice {
	private Map<String, Contact> contacts;
	public Contactservice() {
		contacts = new HasMap<>();
	}
	public void addContact(Contact contact) {
		contacts.put(contact.getContactId(),contact);
	}
	public void deleteContact(String contactId) {
		contacts.remove(contactId);
	}
    public void updateFirstName(String contactId, String newFirstName) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.firstName = newFirstName;
        }
    }
    public void updateLastName(String contactId, String newLastName) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.lastName = newLastName;
        }
    }
    public void updatePhone(String contactId, String newPhone) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.phone = newPhone;
        }
    }
    public void updateAddress(String contactId, String newAddress) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.address = newAddress;
        }
    }
    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}
