package by.belhard26.homework.homework2;

public class task2 {
    public static void main(String[] args) {
        int star[][] = new int[4][];
        int i, j;
        int k = 5;
        int n = star.length;
        int star1 [] [] = new int[n] [n+1];
        for (i = 0; i < star.length; i++) {
           for (j = 0; j < i + 1; j++)  {
                star1 [i][j] = k;
               System.out.print(star1 [i][j] + " ");
                k *= 2; }
            System.out.println();
            }
        for (i = 0; i < star.length; i++) {
            for (j = 0; j < (i + 1) / 2; j++)  {
                int t = star1 [i][j];
                star1 [i][j] = star1 [i][(i+1)-1];
                star1 [i][(i+1)-1] = t;}
            for (j = 0; j < i + 1; j++)  
                System.out.print(star1 [i][j] + " ");

            System.out.println(); }


            System.out.println();   } }





