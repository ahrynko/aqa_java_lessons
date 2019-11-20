package test;

import java.util.Scanner;

public class Retest {
    public static void main(String[] args) {

        int size = 5; //5
        int array[][] = new int[size][size];

        int polo = size / 2;  // 2
        int count = size * size; //25
        for(int i = 0; i < polo; i++){

            for(int j = size-i-1; j > i; j--) array[j][i] = count--;

            for(int j = i; j<=size-i-1; j++) array[i][j] = count--;

            for(int j = i+1; j<=size-i-1; j++) array[j][size-1-i] = count--;

            for(int j = size-2-i; j > i; j--) array[size-1-i][j] = count--;
        }

        if(size%2 == 1)  //5
            array[polo][polo] = 1;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++) {
                System.out.format("%3d",array[i][j]);
            }
            System.out.println();
        }
    }
}
