package Classes;

import java.util.Arrays;

public class SortReverseArray {
    private int[] ints;
    public SortReverseArray(int[] ints) {
        this.ints = ints;
    }
    public void sortReverse() {
        int pos;
        int cont=0;
        int aux;
        for(int i = 0; i< ints.length-1; i++) {//vai até a penultima posição para comparar no final com a ultima
            pos=i;
            for(int j = i+1; j< ints.length; j++) {//varre todas as posições do vetor até a ultima sendo que começa na i+1
                if(ints[pos]< ints[j]) {//com o sinal de menos fica na ordem decrescente e com o sinal de maior fica na ordem crescente
                    pos=j;//armazena a posição onde se encontra o maior numero
                    cont++;//para evitar trocar sem ter achado um numero maior
                }
            }
            if(cont!=0) {//se tiver achado um numero maior quer dizer que cont vai ser maior que 0
                aux = ints[i];
                ints[i] = ints[pos];
                ints[pos] = aux;
            }
            cont=0;
        }

    }
    public void printArray() {
        sortReverse();
        System.out.println(Arrays.toString(ints));
    }
}
