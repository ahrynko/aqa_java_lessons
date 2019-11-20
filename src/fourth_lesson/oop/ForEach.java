package fourth_lesson.oop;

public class ForEach {
  public static void main(String[] args) {

    String[]worlds = {"Hello", "World!!!"};

    System.out.println("indexed loop.....");
    for (int index = 0;index < worlds.length; index++){ //работает с массивами чисел
      worlds[index] = "XYZ"; //заполнить массив значениями (переписать значения массива)
      System.out.println(worlds[index]);
    }

    System.out.println("Foreach loop.....");
    for (String world: worlds){  // контролирует выход за пределы массива
      System.out.println(world);  //работает только на чтение (работает только на вывод инфо)

    }
  }
}
