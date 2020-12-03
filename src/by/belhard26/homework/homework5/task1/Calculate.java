package by.belhard26.homework.homework5.task1;

public class Calculate {
    private double a;
    private double b;

    public Calculate(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double sum(){
        return getA()  + getB();
    }
    public double subtract (){
        return getA()  - getB();
    }
    public double multiply(){
        return getA()  * getB();
    }
    public double divide(){
        return getA()  / getB();
    }


}
