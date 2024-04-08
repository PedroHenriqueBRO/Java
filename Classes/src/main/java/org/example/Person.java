package org.example;

import java.time.LocalDate;

public class Person {
    private String name;
    private int year;

    public Person(){
        this("Indefinido",2024);
    }
    public Person(String name,int year){
        setName(name);
        setYear(year);
    }


    private void setName(String name) {
        this.name = name;
    }

    private void setYear(int year) {

        this.year = year;
    }

    public int getAge(){
        return LocalDate.now().getYear()-year;
    }

    @Override
    public String toString() {
        return "Nome : "+name+" Age : "+getAge();
    }
}
