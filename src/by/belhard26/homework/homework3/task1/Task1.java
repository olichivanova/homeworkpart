package by.belhard26.homework.homework3.task1;

import by.belhard26.homework.homework3.task1.entities.Address;
import by.belhard26.homework.homework3.task1.entities.Building;

public class Task1 {
    public static void main(String[] args) {
        Building building1 = new Building("office", new Address("Lobanka", 25),3,false,"brick", 1985);
        System.out.println("Information about building:");
        System.out.println("Functional " + building1.functional);
        System.out.println("Street " + building1.address.street);
        System.out.println("Number   " + building1.address.number);
        System.out.println(); 
        System.out.println(building1);}}