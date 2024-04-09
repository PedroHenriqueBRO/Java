package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String formatarLinhas= """
                Esse é um texto de cunho informativo
                de como formatar uma string em linhas
                sem precisar de vários souts
                visto que seu uso dedicaria várias digitadas
                é preciso somente colocar 3 aspas duplas no fim e depois no fim da string 
                assim você pode atribuir a uma variável ou printá-la
                """;
        System.out.println(formatarLinhas);
        //printf estilo C
        System.out.printf("Irei usar agora o printf do C%n");
        System.out.printf("Pedro tem %d anos de idade",20);
        System.out.printf("Pedro tem %.2f doláres",20.555556);

    }
}