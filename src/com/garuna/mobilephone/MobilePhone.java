package com.garuna.mobilephone;

import java.util.ArrayList;

public class MobilePhone {
    private String name;
    private ArrayList<Contact> contacts;

    public MobilePhone(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }


    public boolean addContact(Contact contact){

        if(findContact(contact)){
            System.out.println("Contact already exists");
        }
        else{
            this.contacts.add(contact);
        }

    }

    public boolean findContact(Contact contact){
        return this.contacts.contains(contact);
    }

    public Contact modifyContact(Contact contact){
        if(this.contacts.contains(contact))
            return this.contacts.set(this.contacts.indexOf(contact), contact);
        else {
            System.out.println("Error modifying contact. Contact not found!!!");
            return null;
        }
    }

    public boolean removeContact(Contact contact){
        if(this.contacts.contains(contact)){
            return this.contacts.remove(contact);
        }
        else{
            System.out.println("Error removing contact. The contact could not be removed");
            return false;
        }

    }

    public ArrayList<Contact> getAllContacts(){
        return this.contacts;

    }

    public Contact searchContact(String name){
        for(Contact contact: contacts){
            if(contact.name.equals(name))
                return contact;
        }
        System.out.println("Contact not found");
        return null;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "name='" + name + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
