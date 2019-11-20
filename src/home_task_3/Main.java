package home_task_3;

public class Main {
  public static void main(String[] args) {

    int arr[][] = new int[5][5];
    int a = 0;

    for (int i = 0;i < arr.length; i++){  //заполнение массива числами от 0 до 24
      System.out.println();
      for (int j = 0; j < arr[i].length; j++ ){
//        arr[i][j]= a++;
        arr[i][j] = Math.abs(a / 2 - i);
        System.out.print(arr[i][j] + " ");
      }
    }

  }
}
