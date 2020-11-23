package by.belhard26.homework.homework2;

import java.util.Arrays;

public class task1 {
  public static void main(String[] args) {
        int array[] = {0, 0, 11, 0, 0, 100};
        int sum = 0;
        int x;
        double median;
        for (int i :array) sum += i;
        System.out.println("Summa = " + sum);
        double aver = sum / array.length;
        System.out.println("Average  value = " + aver);
      Arrays.sort(array);
      System.out.println("After sorting: " + Arrays.toString(array) );
      System.out.println();
        if (array.length % 2 == 0) {
            median = array[(array.length-1)/2] + array[array.length/2];
            System.out.println(median / 2);
        }
        else {
            median = array[array.length/2];
      System.out.println(median); }
        }

        

  }


         


    
    

