package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal cachorroAlemao = new Animal("Alemao","Big",50);
        Dog Labrador = new Dog("Labrador",40);
        System.out.println(cachorroAlemao);
        Labrador.move("fast");
        Labrador.makeNoise();



    }
}