package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {

        return value / 60;
    }

    public static int euroToRubble(int value) {

        return value * 70;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(300);
        int euroRubble = Converter.euroToRubble(100);
        System.out.println("140 rubles are " + euro + " euro. ");
        System.out.println("300 rubles are " + dollar + " dollar. ");
        System.out.println("100 euro are " + euroRubble + " rubble. ");
    }
}
