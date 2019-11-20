package home_task_2;

public class BinarySearch {

  int search(int[] array, int search){

    int first = 0;               // первый элем. массива по индексу
    int end = array.length - 1;  // послед элем. массива по индексу
    int midle = 0;                // середина массива

    while((first + end)> 0) {
      midle = (first + end) / 2;  // середина массива
      if (array[midle] == search) {   // проверяем число, равно ли элементу который есть в массиве
        return midle;             // возвращаем индекс
      } else {                        // проверяем число, больше или меньше элемента который в середине массива
        if (array[midle] < search) {
          first = midle + 1;
        } else {
          end = midle - 1;
        }
      }
    }
    return -1;
  }
}
