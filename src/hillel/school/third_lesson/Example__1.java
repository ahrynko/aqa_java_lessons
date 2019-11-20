package hillel.school.third_lesson;

public class Example__1 {
  public static void main(String[] args) {
    int[] numbers = {-9, 6, 0, -59};
    int min = numbers[0];
    for(int i = 0; i < numbers.length; i++){
      if(min>numbers[i])
        min = numbers[i];
    }

    System.out.println(min);
  }
}
