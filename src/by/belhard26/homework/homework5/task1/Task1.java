package by.belhard26.homework.homework5.task1;

public class Task1 {
    public static void main(String[] args) {
        Calculate calculate1 = new Calculate(8,5);
        System.out.println(calculate1.sum());
        System.out.println(calculate1.subtract());
        System.out.println(calculate1.multiply());
        System.out.println(calculate1.divide());
        calculate1.toString();
    }
}
