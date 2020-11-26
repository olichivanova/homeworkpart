package by.belhard26.homework.homework3.task3;

import by.belhard26.homework.homework3.task3.ArraysCalculator;

import java.util.Arrays;

public class Task3 {



    public static void main(String[] args) {
        ArraysCalculator calculator = new ArraysCalculator();
        int array1 []  = {1, 5, 3};
        int array2 [] = {2, -5, 4, 10, 5};
        int sum [] = calculator.sumArray(array1, array2);
        System.out.println(Arrays.toString(sum));
        calculator. concatArrays (array1, array2);
    }
}
