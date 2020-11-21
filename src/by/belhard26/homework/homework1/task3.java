package by.belhard26.homework.homework1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class task3 {
    public static void main(String[] args) {
        int temperature = 32;
            if (temperature < 10) System.out.println(" надеваем куртку");
            if (temperature >= 10 && temperature <= 15)
                System.out.println(" надеваем ветровку");
            if (temperature >= 16 && temperature <= 20)
                System.out.println(" надеваем свитер");
            if (temperature >=31) {
                System.out.println(" ничего не надеваем");
                if (temperature >= 21 && temperature <= 30)
                    System.out.println(" надеваем майка");
            }


    }
}
