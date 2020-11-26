package by.belhard26.homework.homework3.task2;

import by.belhard26.homework.homework3.task2.Watch;
import by.belhard26.homework.homework3.task2.Modelcase;
import by.belhard26.homework.homework3.task2.Mark;

public class Task2 {
    public static void main(String[] args) {

        Watch watch1 = new Watch( "Rolex", 25789, "automatic", new Modelcase(42, "rose gold"), "leather",Mark.PREORDER );
        Watch watch2 = new Watch("Chopard", 8754, "mechanial", new Modelcase(38, "white gold"), "metal", Mark.NEW);

        System.out.println(watch1);
        System.out.println();
        System.out.println(watch2);
        watch1.waterResistence(300);
        watch2.waterResistence(120);
        watch1.aslooklike();
        watch2.aslooklike();

    }
}
