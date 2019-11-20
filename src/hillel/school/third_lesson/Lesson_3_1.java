package hillel.school.third_lesson;

public class Lesson_3_1 {
  public static void main(String[] args) {
    int[] array = new int[20];

    for (int array_index = 0; array_index < array.length; array_index++ ){ //array_index +1 //запись масива
      array[array_index] = array_index + 1 ;
    }

    System.out.println("Поиск элемента в массиве!");

    for (int array_index = 0; array_index < array.length; array_index++){ //17
      if(array[array_index] == 17 ){
        System.out.println("Индекс найденного числа: "+ array_index);
        break;
      }
      else {
        System.out.println("Заданное число не найдено!");
      }
    }

  }
}
