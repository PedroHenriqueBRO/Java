package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] dimensionalArray={{1,2,3},{4},{5,6}};
        for (int i = 0; i < dimensionalArray.length; i++) {
            for (int j = 0; j < dimensionalArray[i].length; j++) {
                System.out.print(dimensionalArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        int[][][] threeDimensionalArray=new int[3][][];//contém 3 matrizes de tamanhos variados
        threeDimensionalArray[0]=new int[][]{{1,2},
                                            {4,5}};
        threeDimensionalArray[1]=new int[][]{{7},
                                           {8,11}};
        threeDimensionalArray[2]=new int[3][3];



        for(int[][] i : threeDimensionalArray){//cada matriz em threeDimensionalArray
            for(int[] j : i){//cada vetor dentro de cada matriz i em threeDimensionalArray
                for(int k : j){//cada elemento para cada vetor de cada matriz contida em threeDimensionalArray
                    System.out.print(k+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}