package Classes;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<>();
    public MobilePhone(String number) {
        this.myNumber = number;
    }
    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            return false;
        }else{
            myContacts.add(contact);
            return true;
        }
    }
    public boolean updateContact(Contact oldContact, Contact newContact) {
        if(findContact(newContact.getName()) >= 0) {
            return false;
        }
        else if(findContact(oldContact.getName()) >= 0) {
            myContacts.set(findContact(oldContact.getName()), newContact);
            return true;
        }
        System.out.println("Não existe o contato novo na lista e o passado para ser trocado também não existe!!!");
        System.out.println("Deseja adicionar o novo contato :(S ou N)");
        char verifica=System.console().readLine().charAt(0);
        if(verifica=='S'){
            myContacts.add(newContact);
            return true;
        }else{
            return false;
        }

    }
    public boolean removeContact(Contact contact) {
        if(myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        }else{
            return false;
        }
    }
    private int findContact(Contact contato) {
        if(myContacts.contains(contato)) {
            return myContacts.indexOf(contato);
        }else{
            return -1;
        }
    }
    private int findContact(String name) {

        for(Contact contact : myContacts) {
            if(contact.getName().equals(name)) {
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }
    public Contact queryContact(String name) {
        for(Contact contact : myContacts) {
            if(contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }
    public void printContacts() {
        System.out.println("Contact List:");
        int cont=1;
        for(Contact contact : myContacts) {
            System.out.println(cont+". "+contact.getName()+" -> "+contact.getPhoneNumber());
            cont++;
        }
    }
}
