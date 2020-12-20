package by.belhard26.homework.homework6.task3;

public class Circle implements Figure {

   private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double sqr() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double perimetr() {
        return Math.PI * r * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
