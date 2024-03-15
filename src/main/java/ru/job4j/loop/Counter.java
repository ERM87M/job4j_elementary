package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Counter.sum(0, 5));
        System.out.println(Counter.sum(3, 8));
        System.out.println(Counter.sum(0, 10));
        System.out.println(Counter.sum(5, 2));
    }
}