package home_task1;

public class Count_word {
  public static void main(String[] args) {

    String str = "Helloworldworld&?";

    String name = str.substring(5,15);
    System.out.println(name);
    int count = name.length()/2;

    System.out.println("Первая часть значения: " + name.substring(0,count));
    System.out.println("Вторая часть значения: " + name.substring(count));

  }
}



