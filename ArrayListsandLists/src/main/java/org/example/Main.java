package org.example;
import Classes.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Items newitems= new Items("Garrafa","Plastico",10);//Items do tipo record
        ArrayList<Items> newList= new ArrayList<Items>();//Arraylist do tipo Items
        newList.add(newitems);//adiciono um item no newlist
        newList.add(1,newitems);//adiciona item na posição específica mas só adiciona caso o tamanho do newList permita
        System.out.println(newList.get(1));//printo o elemento da posição 1
        String[] fruits={"apple","banana","melon"};
        List<String> lista=List.of(fruits);//List são imutáveis
        lista.forEach(System.out::println);//printa todos os elements do List
        ArrayList<String> novaArray =new ArrayList<>(lista);//ArrayList pode receber um List como argumento
        //ArrayList<String> novarray =new ArrayList<>(List.of("Pedro","Joao","Ana"));
        //ArrayList<String> novarray =new ArrayList<>(List.of(fruits));
        novaArray.add("grape");//adiciono elemento
        System.out.println(novaArray);//printo array completa
        novaArray.addAll(Arrays.asList("sla","naosei","naoquerosaber"));//adiciono um array de elemento
        novaArray.addAll(List.of("joao","pedro","ana"));//adiciono uma lista de elementos
        System.out.println(novaArray);//printo tudo
        novaArray.retainAll(Arrays.asList("pedro","joao","ana"));//o array agora só vai contar os elementos que condizerem com os escolhidos no parametro
        System.out.println(novaArray);//printo tudo
        novaArray.sort(Comparator.naturalOrder());//Ordem natural do tipo String que seria alfabética
        System.out.println(novaArray);
        String[] aaa=novaArray.toArray(new String[3]);//transforma um arraylist em um array e a variável aaa recebe o retorno
        System.out.println(Arrays.toString(aaa));//retorna todos os elementos de aaa

    }
}