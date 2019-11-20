package polindrom;

import java.util.Arrays;

public class Polindrom {
  public static void main(String[] args) {
        StringBuilder str1 = new  StringBuilder("mam");
        String original = str1.toString();

        String revers = str1.reverse().toString();
        if (original.equals(revers)){
            System.out.println("Word is palindrom");
        }
        else {
            System.out.println("Word is not palindrom");
        }


    String st = "mam";
        char symbols[] = st.toCharArray(); // конвертируем строку в массив символов
        for (int x = symbols.length - 1; x >= 0; x--) {
          System.out.println(x);
          System.out.println(symbols);
        }
//        if () {
//            System.out.println("Word is palindrom");
//        } else {
//            System.out.println("Word is not palindrom");
//        }
//
//
  }
}

