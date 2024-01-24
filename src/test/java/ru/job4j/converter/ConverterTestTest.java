package ru.job4j.converter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTestTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert200RblThen3dot333Dollar() {
        float inputTwo = 200;
        float expectedTwo = 3;
        float valueTwo = 0.0001f;
        float outputTwo = (int) ConverterTest.rubleToDollar(inputTwo);
        Assertions.assertThat(outputTwo).isEqualTo(expectedTwo, withPrecision(valueTwo));
    }

}


