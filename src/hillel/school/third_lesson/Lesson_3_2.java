package hillel.school.third_lesson;

public class Lesson_3_2 {
  public static void main(String[] args) {
    int[] array = new int[20];

    for (int array_index = 0; array_index < array.length; array_index++ ){ //array_index +1 //запись масива
      array[array_index] = array_index + 1 ;
    }

    System.out.println("Поиск элемента в массиве!");

    int index = 0;
    boolean isFound = false;
    for (int array_index = 0; array_index < array.length; array_index++){ //17
      if(array[array_index] == 17 ){
        index = array_index;
        isFound = true;
        break;
      }
    }
    if (isFound){
      System.out.println("Число найдено! Индекс: " + index);
    }else {
      System.out.println("Число не найдено!");
    }
  }
}

