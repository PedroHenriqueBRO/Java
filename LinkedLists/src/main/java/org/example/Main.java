package org.example;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);//first in
        list.add(2);//add
        list.add(3);//add
        list.add(4);//add
        list.offer(5);
        list.offer(6);
        list.offer(7);
        list.offer(8);
        //list.remove();//first in first out ou seja o numero 1
        //list.remove(Integer.valueOf(4));//remove o valor 4
        LinkedList<Integer> stack = new LinkedList<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);//Last in
        System.out.println(stack);
        stack.pop();//Last in first out= 5
        System.out.println(stack.peek());//elemento do topo da pilha
        System.out.println(list.element());//head da list
        System.out.println(list.contains(3));//verifica se contém o valor 3
        System.out.println(list);//printa a lista
        //iterator
        var iterator=list.listIterator(0);
        int cont=0;
        while(iterator.hasNext()){
            if(iterator.next().equals(4)){
                iterator.add(5);//adiciona o 5 depois do 4
            }
        }
        iterator=list.listIterator(0);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}