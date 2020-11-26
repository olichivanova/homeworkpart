package by.belhard26.homework.homework3.task1.entities;

public class Address {

    public String street;
    public int number;
    

public Address (String street, int number)  {
    this.street = street;
    this.number = number;
}
public void addressP (){
        System.out.println( "Street " + street);
        System.out.println(" Number " + number);
    }
}
