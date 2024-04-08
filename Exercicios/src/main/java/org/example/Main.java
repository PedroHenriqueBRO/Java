package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(6, 5);
        Point p2 = new Point(3, 1);
        System.out.println(p1.distance());
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(2,2));

    }
}