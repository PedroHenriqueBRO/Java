package org.example;
import java.util.Scanner;
import Classes.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("C", "Guardioes da galaxia");
        movie.watchMovie();
        //Adventure a=(Adventure) Movie.getMovie("C", "Guardioes da galaxia");//irá gerar um erro ja que tentei contornar
        //o problema do compilador com o casting mas o casting n paça tipo Comedy para Adventure já que eles não tem relação de herança
        Object comedia=Movie.getMovie("C", "Guardioes da galaxia") ;//um Object recebe um tipo que no caso seria comedy
        //comedi.watchMovie();//o Compilador trata o Object da forma mais generica possível assim ele n entende que é um tipo movie
        //muito menos tipo Comedy assim não permitindo o watch movie
        Comedy a=(Comedy) comedia;//um tipo Comedy recebe o comedia feito com casting para Comedy assim passa de um tipo generico
        //mas que tinha caracteristicas do tipo Comedy para o tipo Comedy assim sendo feita a atribuição corretamente
        a.watchComedy();
        Movie filme=(Comedy)comedia;//pode ser feito assim tbm fazendo um upcasting
        filme.watchMovie();
        Movie filmeaux=(Movie)comedia;//E assim fazendo algo mais especifico mas ainda contendo as caracteristica de um filme Comedy
        filme.watchMovie();
        if(a instanceof Comedy com){//instanceof testa o tipo de um objeto e compara ele com o desejado para ver se é compatível
            //com é uma facilidade que o java permite de se a for um tipo Comedy o com seria atribuido com o valor de a e assim podendo ser usado
            com.watchMovie();
            System.out.println("a é do tipo Comedy");
        }



    }
}