package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a=2;
        switch(a%2){
             case 1:
                System.out.println("impar");
                break;
             case 0:
                System.out.println("par");
            default:
                break;

        }
        int value=switch(a%2){
            case 1->1;//impar
            case 0->0;//par
            default-> 3;//nem par e nem impar mas isso é impossivel
        };
        System.out.println(value);
        int cont=0;
        for(;;){
            System.out.println("pedro");
            cont++;
            if(cont==10){
                break;
            }
        }
        for(int x=0;x<10;x++){
            System.out.println("Henrique");
        }
        cont=0;
        while(true){
            System.out.println("Pedro Henrique");
            cont++;
            if(cont==10){
                break;
            }

        }

    }
}