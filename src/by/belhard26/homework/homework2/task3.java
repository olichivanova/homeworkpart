package by.belhard26.homework.homework2;

public class task3 {
    public static void main(String[] args) {
        int num [] = new int[100];
        int i, k = 0;
       for ( i = 0; i < num.length; i++, k++) {
           num[i] = k;
           if (num[i] % 3 == 0 && num[i] % 7 == 0)
               System.out.print(num[i] + " "); }
           System.out.println();

        int num1 [] = new int[100];
        int j, p = 0;
        for ( j = 0; j < num1.length; j++, p++) {
            num1 [j] = p;
            if (num1[j] % 5 == 0 || num1 [j] % 7 == 0)
            System.out.print(num1 [j] + " ");}
        System.out.println();

        int num2 [] = new int[100];
        int t, l = 0;
        for (t = 0; t < num2.length; t++, l++)  {
            num2 [t] = l;
            if (num2 [t] >= 10 && num2 [t] < 20)
                if (num2 [t] % 5 == 0 || num2 [t] % 7 == 0)
                    System.out.print(num2[t] + " ");
            if (num2 [t] >= 30 && num2 [t] < 40)
                if (num2 [t] % 5 == 0 || num2 [t] % 7 == 0)
                System.out.print(num2[t] + " ");
            if (num2 [t] >= 50 && num2 [t] < 60)
                if (num2 [t] % 5 == 0 || num2 [t] % 7 == 0)
                    System.out.print(num2[t] + " ");
            if (num2 [t] >= 70 && num2 [t] < 80)
                if (num2 [t] % 5 == 0 || num2 [t] % 7 == 0)
                    System.out.print(num2[t] + " ");
            if (num2 [t] >= 90 && num2 [t] < 100)
                if (num2 [t] % 5 == 0 || num2 [t] % 7 == 0)
                    System.out.print(num2[t] + " ");
        }


    }
    }
