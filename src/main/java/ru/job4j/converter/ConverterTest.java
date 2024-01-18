package ru.job4j.converter;

public class ConverterTest {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = ConverterTest.rubleToEuro(input);
        boolean passed = expected == output;
        float euro = ConverterTest.rubleToEuro(140);
        System.out.println("140 rubles are 2. Test result : " + euro + " " + passed);
        float inputTwo = 200;
        float expectedTwo = 3;
        int outputTwo = (int) ConverterTest.rubleToDollar(inputTwo);
        boolean passedTwo = expectedTwo == outputTwo;
        int dollar = (int) ConverterTest.rubleToDollar(200);
        System.out.println("200 rubles are 3. Test result : " + dollar + " " + passedTwo);
    }
}
