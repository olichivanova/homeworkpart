package by.belhard26.homework.homework1;

public class task6 {
    public static void main(String[] args) {
        double percent = 12, deposit = 20, deposit1, tax = 1, summtax;
        int year = 3, n;
        percent = percent / 100;
        tax = deposit * tax / 100;
        
        for (n = 1; n <= year; n++) {
            deposit1  = deposit * percent;
            deposit = deposit + deposit1;
            summtax = deposit - tax;
        System.out.println(summtax) ; }

    }
}
