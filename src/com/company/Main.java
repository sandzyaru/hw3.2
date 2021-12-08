package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
          Вам необходимо написать следующий алгоритм сортировки массива по возрастанию: каждую итерацию выбирать самый минимальный элемент и смещать его в начало.
          При этом каждую новую итерацию начинать сдвигаясь вправо, то есть первый проход — с первого элемента, второй проход — со второго и т.д.
          И при каждой итерации распечатывать текущее состояние массива
       */

        /* int n[] = {5,4,3,1,2};
        int s2 =0;
        int min =n[0];
        String s1 = "";
        for (int element:n) {
            s2++;
            if (element < min ) min = element;
            if (element>min) {
                s1= min+ " " +element;
            }
        }


        System.out.println(s1);
*/
        int n[] = {3,0,1,8,7,2,5,4,6,9};

        for(int i = n.length-1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++){

                if( n[j] > n[j+1] ){
                    int ts= n[j];
                    n[j] = n[j+1];
                    n[j+1] = ts;
                }
                System.out.println(Arrays.toString(n));
            }

        }

    }
}
















