package by.belhard26.homework.homework10.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     try{   int n = Integer.parseInt(reader.readLine());
        int i = 0;
        StringBuilder srr = new StringBuilder();
         List<Order> orders = new ArrayList<>();
         if (n<=0)
             System.out.println("Press another number");
        while (i < n){
            String s = reader.readLine();
            System.out.println(s);
            String [] s1 = s.split( " ");
            String nameItem = s1[0];
            double price =Double.parseDouble(s1[1]);
            int quantity = Integer.parseInt(s1[2]);
            Order order = new Order(nameItem, price, quantity );
            orders.add(order);
            i++;}
         System.out.println(orders);
         double result = 0;
         for (Order x: orders)
             result += x.price * x.quantity;
         System.out.println(result);

      /* public static double sum (Order orders) {
           double result = 0;
         for (Order x: orders)
             result = x.price * x.quantity;
             return result; */

         }

     
        catch (IOException e){
         e.printStackTrace();

    }
}  }
