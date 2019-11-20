package fourth_lesson.oop;

public class While {
  public static void main(String[] args) {

    int[] array = {10,9,8,7,6,5,4,3,2,1,0}; //распечать массив - не в foreach
    int index = array.length; // 11

    while (index != 0){
      index --;
      System.out.println(array[index]);
//      index --;

    }

  }
}
