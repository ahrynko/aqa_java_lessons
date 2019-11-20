package sixth_lesson;

import java.util.Arrays;

public class ArraySorter {

  private static int[] defaultArray = { 2,76,0,-6,66,1};   //инициализация либо сразу либо в статическом блоке инициализации
  private static int[] defaultArray1;  // можно заполнить в статическом блоке

  static {                                   //инициализация в статическом блоке
    defaultArray1 = new int[10];
    for (int i = 0; i < defaultArray1.length; i ++){
      defaultArray1 [i] = i;
    }
  }

  private ArraySorter(){  // приватный конструктор запрещает создания объекта

  }

  public static void sortArray(int[]array){
    Arrays.sort(defaultArray);
    System.out.println("Sorted array: "+ Arrays.toString(defaultArray));
  }
}
