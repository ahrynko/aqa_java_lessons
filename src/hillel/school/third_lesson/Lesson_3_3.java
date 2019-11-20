package hillel.school.third_lesson;

public class Lesson_3_3 {
  public static void main(String[] args) {
    int[] array = new int[20];

    for (int array_index = 0; array_index < array.length; array_index++ ){ //запись масива
      array[array_index] = array_index + 1 ;  //1,2,3,4......20- запись
    }

    for (int array_index = array.length - 1; array_index >= 0; array_index--){
      System.out.print(array[array_index]+ " "); //20,19,18....1- запись

    }
  }
}
