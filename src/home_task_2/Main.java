package home_task_2;

public class Main {
  public static void main(String[] args) {

    BinarySearch binarySearch = new BinarySearch();

    int[] array = {4,10,15,114,357,564,890};

    int search = 564;                                  // поиск числа
    int index = binarySearch.search(array, search);  // передаем массив и число в метод

    System.out.println("Поиск элемента " + search + " в одномерном массиве по индексу: " + index);
  }
}
