package sample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public boolean isDuplicate(Contact contact) {
        return contacts.contains(contact);
    }

    public List<Contact> sortAlphabetically() {
        return contacts.stream()
                .sorted(Comparator.comparing(contact -> contact.getFirstName() + " " + contact.getLastName()))
                .toList();
    }

    public List<Contact> sortEntries(String sortBy) {
        return contacts.stream()
                .sorted(Comparator.comparing(contact -> {
                    switch (sortBy) {
                        case "city":
                            return contact.getCity();
                        case "state":
                            return contact.getState();
                        case "zip":
                            return contact.getZip();
                        default:
                            return "";
                    }
                }))
                .toList();
    }

    public void addContact(Contact contact) {
       
        contacts.add(contact);
        System.out.println("Contact added successfully: " + contact.getFirstName() + " " + contact.getLastName());
    }
}
