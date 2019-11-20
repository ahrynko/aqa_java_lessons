package home_task1;

public class Main {
  public static void main(String[] args) {

    String str = "Helloworldworld";
    int count = 0;

      if(str.length() != 0){
        count++;
        //Проверяем каждый символ, не пробел ли это
        for (int i = 0; i < str.length(); i++) {
          if(str.charAt(i) == ' '){
            //Если пробел - увеличиваем количество слов на 1
            count++;
          }
        }
      }

      System.out.println("You enter " +count+ " word!");
    }
  }

