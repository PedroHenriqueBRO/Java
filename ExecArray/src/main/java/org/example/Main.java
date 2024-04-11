package org.example;

import Classes.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] ints = new int[]{1,2,3,4,5,6,7,8,9,10};
        InverseArray nova = new InverseArray(ints);
        nova.printArray();
        int [] intnova = new int[]{1,2,3,4,5,6,7,8,9};
        nova.setInts(intnova);
        nova.printArray();



    }
}