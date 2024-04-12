package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer boxing=15;//esta sendo encaixotado o valor 15 para uma variavel do tipo object que é o Integer
        int value=boxing;//o valor da variavel boxing esta sendo desencaixotado para a variavel value do tipo int que recebe 15
        System.out.println(value);//15
        System.out.println(boxing);//15
        System.out.println(boxing.intValue());//15
        Double doubleBoxing=Double.valueOf(20.00);//Encaixotando o valor 20 em um Double
        System.out.println(doubleBoxing);//20
        double unboxingDouble=doubleBoxing;
        System.out.println(unboxingDouble);//20
        //Boxing e unboxing no sentido de Arraylists
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(20.00);//boxing
        list.add(30.00);//boxing
        list.add(40.00);//boxing
        System.out.println(list);//unboxing
        System.out.println(list.contains(20.00));//verifica se contém o double 20.00
        list.remove(20.00);//remove o 20.00
        System.out.println(list);//unboxing

    }
}