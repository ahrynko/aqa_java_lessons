package home_task1;

import java.util.ArrayList;
import java.util.List;

public class Count_hello {
  public static void main(String[] args) {
    String str = "Helloworldworld";
    String findStr = "world";
    int lastIndex = 0;
    List<Integer> result = new ArrayList<Integer>();

    while(lastIndex != -1) {

      lastIndex = str.indexOf(findStr,lastIndex);

      if(lastIndex != -1){
        result.add(lastIndex);
        lastIndex += 1;
      }
    }
    System.out.println(result);
    int arrayLength = result.size();  //вычисления длины любой коллекции - применяется метод size
    System.out.println("Количество повторений слова world = " + arrayLength + " элемента");

  }
}
