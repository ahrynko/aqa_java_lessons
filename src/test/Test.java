package test;

import java.util.Arrays;
import java.util.Random;

public class Test {
  public static void main(String[] args) {

   Random random = new Random();

    int[][] array= new int[5][5];
    int[] temp;

    for (int i = 0; i < array.length; i ++){    //запись масива
      for (int j = 0; j < array.length; j ++){
        array[i][j] = random.nextInt(10);
      }
    }

      for (int i = 0; i < array.length; i ++){  //чтение массива
      for (int j = 0; j < array.length; j ++){
        System.out.format("%3d",array[i][j]);
      }
      System.out.println();
    }
    System.out.println();
// reverse  4-5 stroki
    temp=Arrays.copyOf(array[4], array[4].length);
    array[4]=Arrays.copyOf(array[3], array[3].length);
    array[3]=Arrays.copyOf(temp, temp.length);
    Arrays.deepToString(array);

    for (int i = 0; i < array.length; i ++){      //чтение массива
      for (int j = 0; j < array.length; j ++){
        System.out.format("%3d",array[i][j]);
      }
      System.out.println();
    }
//    System.out.println(Arrays.deepToString(array));  //в одну строку

  }
}
