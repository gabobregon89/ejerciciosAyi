package acme.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
public class AddressBook {
  // Return all contacts
  List<Contact> contacts = new ArrayList();

  public List<Contact> findAllContacts() {
    return contacts;
  }

  // Return all contacts matching name (case-insensitive)
  public List<Contact> findContactsByName(String name) {
    String namePattern = ".*" + (name != null ? name.toUpperCase() : "") + ".*";
    List<Contact> matches = new ArrayList();
    for (Contact c : contacts) {
      if (Pattern.matches(namePattern, c.getName().toUpperCase())) {
matches.add(c);
      }
    }
    return matches;
  }

  public AddressBook() {
    contacts.add(new Contact("Jeff", "jeff@acme.org"));
    contacts.add(new Contact("Charles", "cyoung@acme.org"));
    contacts.add(new Contact("Gary", "gary@acme.org"));
    contacts.add(new Contact("Yvonne", "yvonne_yvonne@acme.org"));
    contacts.add(new Contact("Sung", "superstar001@acme.org"));
    contacts.add(new Contact("Shailyn", "spatellina@acme.org"));
    contacts.add(new Contact("John", "jjb@acme.org"));
    contacts.add(new Contact("Ricky", "rmartz@acme.org"));
    contacts.add(new Contact("Shaoling", "shaoling@acme.org"));
    contacts.add(new Contact("Olga", "olga077@acme.org"));
    contacts.add(new Contact("Ron", "regert@acme.org"));
    contacts.add(new Contact("Juan", "jperen@acme.org"));
    contacts.add(new Contact("Uday", "udaykum@acme.org"));
    contacts.add(new Contact("Amin", "amin@acme.org"));
    contacts.add(new Contact("Sati", "sparek@acme.org"));
    contacts.add(new Contact("Kal", "kalyane.kushnane@acme.org"));
    contacts.add(new Contact("Prakash", "prakash01@acme.org"));
  }
}
