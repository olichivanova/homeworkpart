package by.belhard26.homework.homework6.task3;

public class Task3 {
    public static void main(String[] args) {
Figure circle = new Circle(5);
Figure rectangle = new Rectangle(2.1, 2.5);
Figure square = new Square( 4.2, 4.2);

        System.out.println(circle);
        System.out.println("Square" + CalculationUtils.sqr(circle));
        System.out.println("Perimetr" +  CalculationUtils.perimeter(circle));

        System.out.println();
        System.out.println(rectangle);
        System.out.println("Square" + CalculationUtils.sqr(rectangle));
        System.out.println("Perimetr" +  CalculationUtils.perimeter(rectangle));

        System.out.println();
        System.out.println(square);
        System.out.println("Square" + CalculationUtils.sqr(square));
        System.out.println("Perimetr" +  CalculationUtils.perimeter(square));


    }   }
