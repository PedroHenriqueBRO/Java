package org.example;
import Classes.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Days dia = Days.valueOf("Monday");//dia recebe o valor de um dia que no caso foi Monday
        Days[] dias = Days.values();//retorna todos os valores do enum para um vetor de Days chamado dias que contém todos os dias da semana
        System.out.println(dias[0]);//printa o dia na posição 0

        for (Days day : dias) {//printa todos os dias semana
            System.out.println(day+","+(day.ordinal()+1));
        }
        System.out.println();
        Toppings[] toppings = Toppings.values();//toppings recebe todos os valores do enum toppings
        for (Toppings topping : toppings) {//printa todos os acrescimos
            System.out.println(topping+",valor :"+topping.getPrice());
        }

    }
}