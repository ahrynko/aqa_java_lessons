package eighth_lesson.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>();
  /* words.forEach(item -> {            //item -> анонимная функция, которвя выполняется внутри другого кода
     Boolean contains = item.contains("XYZ"); //item -type String !!элемент - не индекс!!
     System.out.println(contains);
   });*/
  fillArrayList(numbers, 100);  // заполнение коллекции
    int foundIndex = searchFor(5,numbers);  // нахождение  числа в коллекции
    if (foundIndex > 0) {
      System.out.println("The number is found! Index is: " + foundIndex);
    }else {
      System.out.println("The number is not found! Index is: '-1'");
    }
  }                     // заполнение коллекции универсальная
  private static void fillArrayList (List<Integer>numbers ,int bound ) {  //  bound -граница до скольки
    for (int number = 0; number <= bound; number++ ) {  // number -значение, не индекс!
      numbers.add(number); // заполнение коллекции от 0 до 100 (заданная граница в методе)
    }
  }                     // нахождение  числа в коллекции
  private static int searchFor(int number, List<Integer>numbers){  // где искать число в коллекции List<Integer>numbers
    for (int index = 0; index < numbers.size() ; index++) {
      if (numbers.get(index)== number){                // будет возвращен index
        return index;
      }
    }
    return -1; //если число не найдено -1
  }
}
