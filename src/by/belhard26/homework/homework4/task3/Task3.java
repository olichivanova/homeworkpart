package by.belhard26.homework.homework4.task3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Order order1 = new Order("Bread Borodinsky", 25);
        System.out.println( ("Item " + order1.getItem()));
        order1.calculation();
        Order order2 = new Order("Milk 1.5%", 5) ;
        System.out.println( ("Item " + order2.getItem()));
        order2.calculation();

} }
