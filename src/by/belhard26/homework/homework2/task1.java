package by.belhard26.homework.homework2;

public class task1 {
  public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        double median;
        for (int i :array) sum += i;
        System.out.println("Summa = " + sum);
        double aver = sum / array.length;
        System.out.println("Average  value = " + aver);
        if (array.length % 2 == 0) {
            median = array[(array.length-1)/2] + array[array.length/2];
            System.out.println(median / 2);
        }
        else {
            median = array[array.length/2];
      System.out.println(median); }
        }

        

  }


         


    
    

