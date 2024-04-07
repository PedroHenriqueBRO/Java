package org.example;

public class TestConsole {
    public static void main(String[] args) {
        try {
            int age = Integer.parseInt(System.console().readLine("Qual a sua idade :"));
            System.out.println(age);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
