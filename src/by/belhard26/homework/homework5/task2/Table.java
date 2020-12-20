package by.belhard26.homework.homework5.task2;

public class Table {

    public static void main(String[] args) {

      /*  int [][] array = new int [10][10];
        int k = 1; */

        for (int i = 1; i < 10; i++) {
           /* k = i; */

            for (int j = 1; j < 10; j++) {
               if (i == 1 && j == 1) {
                   System.out.printf("%4s", "");
               continue;  }
               /* array[i][j] = k;
                k += i;   */
                System.out.printf("%4d", i * j);
            } 
            System.out.println();
        }
    }
}
