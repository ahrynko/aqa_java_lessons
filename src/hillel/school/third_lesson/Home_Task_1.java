package hillel.school.third_lesson;

import java.util.Random;

public class Home_Task_1 {
  public static void main(String[] args) {

    int[] array = new int[100];

    Random random = new Random();

    for (int array_index = 0; array_index < array.length; array_index++) { //запись масива
      array[array_index] = random.nextInt(150);
      System.out.print(array[array_index] + " ");
    }
    int max = array[0];
    int min = array[0];
    for (int array_index = 0; array_index < array.length; array_index++) //чтение массива
      if (max < array[array_index]) {
        max = array[array_index];
      } else if (min > array[array_index]) {
        min = array[array_index];
      }
    System.out.println();
    System.out.println("The very minimum value is: "+ min);
    System.out.println("The very maximum value is: "+ max);

  }
}

