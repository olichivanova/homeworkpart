package by.belhard26.homework.homework4.task3;

import java.util.Random;

public class Order {

    private String item;
    private int quantity;
    private double priceItem;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double priceItem) {
        this.priceItem = priceItem;
    }

    public Order( String item, int priceItem) {
        this.item = item;
        this.quantity = quantity;
        this.priceItem = priceItem;

    }

    public void calculation () {
        Random random = new Random();
        int x = 100;
        double sumOrder = 0;
        double order [] = new double[10];


        for (int i = 0; i < order.length; i++)  {
            order [i] = random.nextInt(x+1);
            System.out.print(order [i] + " ");
        }
        System.out.println();
        for (int i = 0; i < order.length; i++) {
            if (order [i] >= 10)
                order [i] = order[i] * getPriceItem() * 0.9;

            else if (order [i] >= 50)
                order [i] = order[i] * getPriceItem()* 0.8;
            else  order [i] = order[i] * getPriceItem();

            System.out.print (order [i] + " ");
            sumOrder = sumOrder + order [i];

        }
        System.out.println();
        System.out.println("Sum of order: " + sumOrder);

    }
}
