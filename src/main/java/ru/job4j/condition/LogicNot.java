package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return num < 0;
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        System.out.println(LogicNot.isEven(2));
        System.out.println(LogicNot.isPositive(2));
        System.out.println(LogicNot.notEven(3));
        System.out.println(LogicNot.notPositive(-1));
        System.out.println(LogicNot.notEvenAndPositive(3));
        System.out.println(LogicNot.evenOrNotPositive(2));
    }
}
