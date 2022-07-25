package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/resources.csv")
    public void test(int expected, int lowerRangeLimit, int upperRangeLimit) {

        SQRService service = new SQRService();
        int countOfNumbers = service.searchNumbersWhoseSquaresBelongRange(lowerRangeLimit, upperRangeLimit);
        Assertions.assertEquals(expected, countOfNumbers);
    }

}
