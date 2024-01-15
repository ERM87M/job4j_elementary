package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;

    }

    public static void main(String[] args) {
        System.out.println(RectangleArea.square(6, 2));
    }
}
