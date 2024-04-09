package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //metodos inspecionadores de string , ou seja q só verificam mas não alteram
        String name="Pedroe";
        System.out.println(name.length());//tamanho da string
        System.out.println(name.toUpperCase());//string no formato maiusculo
        System.out.println(name.toLowerCase());//em formato minusculo
        System.out.println(name.charAt(0));//retorna o caractere na posição indicada
        System.out.println(name.indexOf("dr"));//retorna a posição onde começa a ocorrencia da string ou char
        System.out.println(name.isEmpty());//retorna true se a string for vazia
        System.out.println(name.isBlank());//retorna true se a string for vazia ou só possuir espaços em branco
        System.out.println(name.lastIndexOf("e"));//ultimo indicio de um caractere se a string possuir ele
        System.out.println(name.contains("oee"));//retorna true se a string passada está contida na string original
        

    }
}