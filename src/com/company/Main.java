package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        System.out.println("Вариант обработки данных с помощью методов коллекций:");
        System.out.println("Изначальный массив:");
        System.out.println(intList);

        //Исключение отрицательных чисел:
        //+оставить только четные.
        List<Integer> intList2 = new ArrayList<>();
        for (Integer i : intList) {
            if ((i > 0) && (i % 2 == 0)) {
                intList2.add(i);
            }
        }
        System.out.println(intList2);

        //Сортировка по возрастанию:
        intList2.sort(Comparator.naturalOrder());
        System.out.println(intList2);

        System.out.println();
        System.out.println("ОБРАБОТКА ДАННЫХ С ПОМОЩЬЮ Stream:");
        StreamMain v2 = new StreamMain(intList);
        v2.streamSort();
    }
}
