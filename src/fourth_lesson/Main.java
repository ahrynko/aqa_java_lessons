package fourth_lesson;

import fourth_lesson.oop.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] array = new int[20]; //инициализация массива
//
//        Random random = new Random();
//
//        for (int array_index = 0; array_index < array.length; array_index ++){ //запись массива
//            array[array_index] = random.nextInt(100);
//        }
//        System.out.println("before sorting ...");
//        System.out.println(Arrays.toString(array));
//
//        ArraySorter arraySorter = new ArraySorter(array); //создание объекта ArraySorter
//        int[] sortedArray = arraySorter.sortArray("DESC");
//
//        System.out.println("after sorting ...");
//        arraySorter.printArray(sortedArray);

        /*Car car = new Bmw("X5");
        System.out.println(car.getCarModel());

        Car car1 = new Audi("RS7");
        System.out.println(car1.getCarModel());

        Acura acura = new Acura();
        System.out.println(acura.toString());

        Acura acura1 = new Acura("red");
        System.out.println(acura1.toString());

        Acura acura2 = new Acura();
        acura2.setColor("black");
        System.out.println(acura2.getColor());
        System.out.println(acura2.toString());

        Car bmw = new Bmw("M5");
        bmw.print();*/


        Random random = new Random();
        int digit = random.nextInt();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Computer загадал число. Введите свое число для угадывания");
            int guessedNumber = scanner.nextInt(); //Integer.parseInt(inputNumber) строку в число
            if (guessedNumber == digit){
                System.out.println("МОлодца. Ты выиграл!");
                break;
            } else {
                System.out.println("You lool.");
            }
        }while (true);

    }
}
