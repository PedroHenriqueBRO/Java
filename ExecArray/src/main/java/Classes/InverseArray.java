package Classes;

import java.util.Arrays;

public class InverseArray {
    private int[] ints;
    public InverseArray(int[] ints) {
        this.ints = ints;
    }
    public void arrayInverter(){
        int cont=ints.length-1;
        int aux;
        for(int i = 0; i<(ints.length/2); i++){
            aux = ints[i];
            ints[i] = ints[cont];
            ints[cont] = aux;
            cont--;
        }
    }
    public void printArray(){
        arrayInverter();
        System.out.println(Arrays.toString(ints));
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }
}
