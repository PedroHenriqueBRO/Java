package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Pedro",2004);//classe Person criada com construtor de 2 parâmetros
        Person personaux= new Person();//classe Person criada com construtor vazio

        System.out.println(person);
        System.out.println(personaux);
        Costumer costumer = new Costumer("Pedro",2000,"pedro@aluno");//classe Costumer criada com construtor de 3 parâmetros
        Costumer costumeraux = new Costumer();//classe Costumer criada com construtor vazio
        System.out.println(costumer);
        System.out.println(costumeraux);
        Student novo=new Student("Pedro",20,"Terceiro ano");//Record é um tipo que armazena informações que não são alteradas , só recuperadas.
        System.out.println(novo);


    }
}