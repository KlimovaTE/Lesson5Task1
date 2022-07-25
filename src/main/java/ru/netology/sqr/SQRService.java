package ru.netology.sqr;

public class SQRService {
    public int searchNumbersWhoseSquaresBelongRange(int lowerRangeLimit, int upperRangeLimit) {
        int countOfNumbers = 0;

        for (int i = 10; i < 100; i++) {
            if (i * i >= lowerRangeLimit & i * i <= upperRangeLimit) {
                countOfNumbers = countOfNumbers + 1;
            }
        }
        return countOfNumbers;
    }
}
