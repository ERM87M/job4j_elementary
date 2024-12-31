package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        short womanHeight = 175;

        double manWeight = manWeight(manHeight);
        double womanWeight = womanWeight(womanHeight);

        System.out.println("Man with height " + manHeight + " cm weighs " + manWeight);
        System.out.println("Woman with height " + womanHeight + " cm weighs " + womanWeight);
    }
}
