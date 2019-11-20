package home_task;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int result;

    Calculator calc = new Calculator();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first number in console ...");
    int num1 = scanner.nextInt();

    System.out.println("Enter sign");
    String operation = scanner.next();
    System.out.println("Enter the second number in console ...");
    int num2 = scanner.nextInt();
    switch (operation) {
      case "+":
        result = calc.getAdd(num1,num2);
        System.out.println(result);
        break;
      case "-":
        result = calc.getSubtract(num1, num2);
        System.out.println(result);
        break;
      case "*":
        result = calc.getMultiply(num1, num2);
        System.out.println(result);
        break;
      case "/":
        if(num1 != 0 && num2 != 0) {
          result = calc.getDivide(num1, num2);
          System.out.println(result);
        }else {
          System.out.println("Division by zero");
        }
        break;
      default:
        System.out.println("Wrong sign operation");
        break;
    }

  }
}
