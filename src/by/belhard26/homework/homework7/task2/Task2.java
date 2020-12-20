package by.belhard26.homework.homework7.task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        ListPurchases item1 = new ListPurchases("bread");
        ListPurchases item2 = new ListPurchases("milk");
        ListPurchases item3 = new ListPurchases("butten");
        ListPurchases item4 = new ListPurchases("chocolate");
        ListPurchases item5 = new ListPurchases("coffe");
        Map<String, List<ListPurchases>> order = new HashMap<> ();

      addItem("Mark", Arrays.asList(item1,item4));
        System.out.println(order);
       addItem("Natasha", Arrays.asList( item2,item5, item4));
        addItem("Oleg",Arrays.asList(item3,item1));
        addItem("Nina", Collections.singletonList(item4));
       // listpurchases.put("Mark", Arrays.asList(item1,item4));}}
        System.out.println(order);
    }


    public static Map<String, List<ListPurchases>> addItem (String name, List<ListPurchases> item) {
        Map<String, List<ListPurchases>> result = new HashMap<String, List<ListPurchases>>() ;
        
        result.put(name,  item);

        return result;
          

    }
}
