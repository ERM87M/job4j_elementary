package ru.job4j.loop;

public class CounterTwo {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(CounterTwo.sum(0, 5));
        System.out.println(CounterTwo.sum(3, 8));
        System.out.println(CounterTwo.sum(0, 10));
        System.out.println(CounterTwo.sum(5, 2));
        System.out.println(CounterTwo.sumByEven(0, 10));
        System.out.println(CounterTwo.sumByEven(4, 8));
        System.out.println(CounterTwo.sumByEven(1, 10));
    }

}

