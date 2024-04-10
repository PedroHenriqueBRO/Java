package org.example;
import Classes.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MealOrder nova= new MealOrder();
        nova.addBurgerToppings("Bacon","Cheese",null);
        nova.printItemizedList();
        nova.setSizeDrink("Large");
        nova.printItemizedList();


    }
}