package ru.job4j.array;
/*
  6.0.1. Объявление массива. [#3613 #492235]
  6.0.2. Размер массива [#333582 #492238]
  6.0.3. Заполнение массива. [#226300]
 */

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);

        String[] names = new String[4];
        names[0] = "Roman";
        names[1] = "Alex";
        names[2] = "Andrey";
        names[3] = "Nikolya";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
