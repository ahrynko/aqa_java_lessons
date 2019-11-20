package hillel.school.third_lesson;

import java.util.Arrays;

public class Lesson_3 {
  public static void main(String[] args) {

    int[] array = new int[20];

    System.out.println("Запись массива!");

    for (int array_index = 0; array_index < array.length; array_index++ ){ //array_index +1 //запись масива
      array[array_index] = array_index + 1 ;
    }
    System.out.println("Чтение массива!");
    System.out.println(Arrays.toString(array));

    System.out.println("Сумма всех элементов массива!");

    int arrayCellsSumm = 0;
    for (int array_index = 0; array_index < array.length; array_index++ ){
      arrayCellsSumm += array[array_index];// arrayCellsSumm = arrayCellsSumm + array[array_index]
    }
    System.out.println("сумма всех элементов массива: " + arrayCellsSumm);


    /*for (int array_index = 0; array_index < array.length; array_index++ ){ //чтение массива
      int cellValue = array[array_index];
      System.out.println(cellValue);
    }*/
  }
}
