package by.belhard26.homework.homework6.task3;

import java.util.Arrays;
import java.util.List;

public class Task3a {
    public static void main(String[] args) {
        List<Figure> figures = Arrays.asList(
                new Circle(10),
                new Rectangle(5, 10),
                new Square(5,5)
        ) ;

        for (Figure figure: figures) {
            System.out.println(figure.getClass().getSimpleName() + ":");
            System.out.println("Square" + CalculationUtils.sqr(figure));
            System.out.println("Perimetr" + CalculationUtils.perimeter(figure));
        }
    }
}
