package by.belhard26.homework.homework1;

public class task2 {
    public static void main(String[] args) {
        int r = 1;
        double c, s;
        double pi = 3.1415;
        if (r >= 0) {
            c = 2 * pi * r;
            s = pi * r * r;
            System.out.println(" окружность = " + c);
            System.out.println("площать = " + s);
        }
        else
            System.out.println("невалидность входных данных");

    }

}
