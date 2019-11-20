package hillel.school.third_lesson;

import java.util.Random;

public class Home_Task_3 {
  public static void main(String[] args) {
    int[] array = new int[100];
    Random random = new Random();

    for (int array_index = 0; array_index < array.length; array_index++ ){
      array[array_index] = random.nextInt(15);
      System.out.print(array[array_index]+ " ");
    }
    System.out.println();

    int summ = 0;
    for (int array_index = 0; array_index < array.length; array_index++ ){
      if (array[array_index]%2==0){
        System.out.println("Число делится нацело на 2: " +array[array_index]);
        summ += array[array_index];
      }else {
        System.out.println("Число не делится нацело на 2: "+array[array_index] );
      }
    }
    System.out.println("Сумма чисел которые нацело делятся на 2: " + summ);
  }
}
