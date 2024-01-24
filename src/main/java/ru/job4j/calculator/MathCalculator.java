package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);

    }

    public static double resDiffAndDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double resAllCalculation(double first, double second) {
        return sumAndMultiply(first, second) + resDiffAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("��������� ������� �����: " + sumAndMultiply(10, 20));
        System.out.println("��������� ������� �����: " + resDiffAndDivision(10, 20));
        System.out.println("��������� ������� �����: " + resAllCalculation(10, 20));
    }
}
