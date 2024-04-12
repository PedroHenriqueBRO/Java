package org.example;
import Classes.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MobilePhone pedro= new MobilePhone("38991740322");
        Contact bob=new Contact("Bob","31415926");
        Contact alice=new Contact("Alice","16180339");
        Contact tom=new Contact("Tom","11235813");
        Contact jane=new Contact("Jane","23571113");
        pedro.addNewContact(bob);
        pedro.addNewContact(alice);
        pedro.addNewContact(tom);
        pedro.addNewContact(jane);
        pedro.printContacts();
        pedro.updateContact(bob,new Contact("Pedro","38994024531"));
        pedro.printContacts();

        System.out.println(pedro.queryContact(jane.getName()));




    }
}