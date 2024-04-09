package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String birthdate="31/03/2004";
        int indexof=birthdate.indexOf("2004");
        System.out.println(indexof);//indice indexof
        System.out.println(birthdate.substring(indexof));//retorna a substring a partir do indice passado até o final da string
        System.out.println(birthdate.substring(3,5));//retorna a substring contando o caractere de inicio e excluindo o caractere do fim do intervalo
        String newdate=String.format("%d/0%d/%d",31,3,2004);//formata a string como se fosse um printf do C
        System.out.println(newdate);
        String usoJoin=String.join("/","31","03","2004");//coloca um delimitador que fica entre os elementos colocados
        System.out.println(usoJoin);
        String diaMes="31/03";
        String ano="2004";
        String aniversario=diaMes.concat("/").concat(ano);//concatena strings, mesma coisa de fazer aniversario=diaMes+"/"+ano
        System.out.println(aniversario);
        aniversario=aniversario.replace("/","-");
        System.out.println(aniversario);
        aniversario=aniversario.replace("00","22");
        System.out.println(aniversario);
        //replace troca o primeiro valor passado pelo segundo valor passado
        System.out.println("  Pedro  henrique\n".repeat(2).indent(-2));//printa n vezes o valor dependendo do count digitado
        //indent coloca n espaços antes da posição 0 da string, numero negativos retiram espaços caso aja antes da string digitada

    }
}