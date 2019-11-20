package home_task_2;

public class Remainder {
  public static void main(String[] args) {

      int a = 10;
      int num = 0 ;
      String remaind = "";

    while (a != 0){
      num = a % 2;
      a = a / 2;
      System.out.println(num);
      remaind = num + remaind;
    }
    System.out.println("Перевод числа из 10-й системы в 2-ю систему: " + remaind);

  }
}


