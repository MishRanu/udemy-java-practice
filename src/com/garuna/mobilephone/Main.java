package com.garuna.mobilephone;

public class Main {
    public static void main(String[] args){
        MobilePhone mobilePhone = new MobilePhone("Anurag Mobile");

        mobilePhone.addContact(new Contact("Anurag", 7376884799l));
        System.out.println(mobilePhone.getAllContacts());
        mobilePhone.modifyContact(new Contact("Anurag", 7391990807l));
        System.out.println(mobilePhone.getAllContacts());
        System.out.println(mobilePhone.searchContact("Anurag"));
    }
}
