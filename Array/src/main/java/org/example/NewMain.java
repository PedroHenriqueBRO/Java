package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NewMain {
    public static void main(String... args) {
        int[] a = new int[]{5,4,3,2,1};//array criada com 5 elementos
        int [] b = Arrays.copyOf(a,a.length);//array b é uma cópia de a
        System.out.println(Arrays.toString(b));//printo b
        Arrays.sort(a);//ordeno os elementos de a
        b=Arrays.copyOf(a,a.length);//b recebe a cópia ordenada de a
        System.out.println(Arrays.toString(b));//printo b
        Arrays.fill(a,10);//preencho todos as posições de a com o valor 10
        System.out.println(Arrays.toString(a));//printo a

        printText(a);
        printText(5);

    }
    public static void printText(int... text){//com o uso de "..." você pode passar somente um argumento ou mais que no caso seria um vetor de ints
        for(int i : text){
            System.out.println(i);
        }
    }
}
