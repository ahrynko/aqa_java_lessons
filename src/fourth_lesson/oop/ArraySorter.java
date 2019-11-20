package fourth_lesson.oop;

import java.util.Arrays;

public class ArraySorter { //собственный класс

    private int[]array; //  ссылка на масив

    public ArraySorter(int[] array){  //конструктор,- метод который не возвращ. ничего
        this.array = array;
    }
    public int[] sortArray(String sortingOrder){  //ASC  DESC
        if (sortingOrder.equals("DESC")){
            for (int i = 0; i < array.length; i ++){
                for (int j = i +1 ; j < array.length; j++){
                    if (array[i] < array[j]){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }else {
            for (int i = 0; i < array.length; i ++){
                for (int j = i +1 ; j < array.length; j++){
                    if (array[i] > array[j]){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }
    public void printArray (int[] sortedArray){
        System.out.println(Arrays.toString(sortedArray));
    }
}
