package by.belhard26.homework.homework4.task1;

import java.lang.reflect.Array;
import java.util.Random;

public class Description {
    double startTemp;
    double tempDiff;
    int days;


    public Description (double startTemp, double tempDiff, int days) {
        this.days = days;
        this.startTemp = startTemp;
        this.tempDiff = tempDiff;

    }

    public void massive ()  {
        double start = startTemp - tempDiff;
        double end = startTemp + tempDiff;
        System.out.print(startTemp + " ");
        for (int i = 1; i < days; i++) {
            double r = new Random().nextDouble();
            double result  =  start + (r * (end - start));
            System.out.print(result + " ");
        }
        System.out.println();
      


        }
    }

