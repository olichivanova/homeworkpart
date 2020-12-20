package by.belhard26.homework.homework10.task2;

public class Order {
    public String nameItem;
    public double price;
    public int quantity;

    @Override
    public String toString() {
        return "Order{" +
                "nameItem='" + nameItem + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public Order(String nameItem, double price, int quantity) {
        this.nameItem = nameItem;
        this.price = price;
        this.quantity = quantity;
    }
}
