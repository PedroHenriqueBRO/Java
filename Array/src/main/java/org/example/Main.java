package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] intArray=new int[10];//declaração de um array de inteiros com 10 posições
        intArray[0]=10;//valor 10 na posição 0
        intArray[1]=20;//valor 20 na posição 1
        double[] doublearray =new double[10];//double com 10 posições
        doublearray[0]=10.0;//valor 10 na posição 0
        doublearray[1]=20.0;//valor 20 na posição 1
        System.out.println(intArray[0]);//retorna o valor da posição 0 do array
        System.out.println(doublearray[1]);//retorna o valor da posição 1 do array
        System.out.println(doublearray[2]);//se não tiver elemento atribuido manualmente o valor será o default , que nesse caso é 0 já que é do tipo valor
        String[] stringarray =new String[10];//array de String com 10 posições
        System.out.println(stringarray[0]);//é automaticamente preenchido todas as posições como null já que String é do tipo Object
        int[] indexadas = {1,2,3,4,5};//cria um array com 5 posições preenchidas
        for (int indexada : indexadas) {//estilo for each (tipo variavel : array(ou list))
            System.out.println(indexada);
        }String arrayelements= Arrays.toString(indexadas);//Transforma os elementos de um array de ints para um toString que retorna uma string com todos os elementos do array
        System.out.println(arrayelements);
        if(indexadas instanceof int[]){//verifica se indexadas é uma instacia de int[]
            System.out.println("True");
        }





    }
}