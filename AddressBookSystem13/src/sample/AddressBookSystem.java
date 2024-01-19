package sample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AddressBookSystem {
    private Map<String, AddressBook> addressBooks = new HashMap<>();

    public void addAddressBook(String name) {
        addressBooks.put(name, new AddressBook());
    }

    public void addContactToAddressBook(String addressBookName, Contact contact) {
        AddressBook addressBook = addressBooks.get(addressBookName);
        if (addressBook != null) {
            if (!addressBook.isDuplicate(contact)) {
                addressBook.addContact(contact);
            } else {
                System.out.println("Duplicate contact found. Not added.");
            }
        } else {
            System.out.println("Address Book not found.");
        }
    }


    public List<Contact> sortAlphabetically(String addressBookName) {
        AddressBook addressBook = addressBooks.get(addressBookName);
        if (addressBook != null) {
            return addressBook.sortAlphabetically();
        } else {
            System.out.println("Address Book not found.");
            return null;
        }
    }

}
