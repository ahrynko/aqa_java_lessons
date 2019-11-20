package hillel.school.third_lesson;

import java.util.Random;

public class Home_Task_2 {
  public static void main(String[] args) {

    int[] arr = new int[100];

    Random random = new Random();
    float arrayCellsSumm = 0;
    for (int array_index = 0; array_index < arr.length; array_index++ ){ //запись масива
      arr[array_index] = random.nextInt(25);
      System.out.print(arr[array_index] + " ");
      arrayCellsSumm += arr[array_index];
    }
    System.out.println();
    System.out.println("сумма всех элементов массива: " + arrayCellsSumm);
    float average = arrayCellsSumm/arr.length;
    System.out.println("среднее арифметическое равно: "+ average);
  }
}
