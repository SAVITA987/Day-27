package sample;

import java.util.List;

	public class AddressBookMain {
	    public static void main(String[] args) {
	        AddressBookSystem addressBookSystem = new AddressBookSystem();
	        
	        addressBookSystem.addAddressBook("Personal");
	        addressBookSystem.addAddressBook("Work");
	        
	        Contact contact1 = new Contact("Savita", "Tekale", "Gandhi nager", "Bhokar", "Maharastra", "12345", "9234567890", "savita@gmail.com");
	        addressBookSystem.addContactToAddressBook("Personal", contact1);
	        
	        Contact duplicateContact = new Contact("Savita", "Tekale", "Anand Nager", "Nanded", "Maharastra", "67890", "9876543210", "savita@gmail.com");
	        addressBookSystem.addContactToAddressBook("Personal", duplicateContact);
	        
	        List<Contact> sortedContacts = addressBookSystem.sortAlphabetically(null);
	        System.out.println("Sorted Contacts Alphabetically");
//	        sortedContacts.forEach(System.out::println);
	    }
	}


