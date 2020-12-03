package by.belhard26.homework.homework5.task3;

import java.util.Arrays;

public class StringStorage {

    private String [] array = new String[6];
    private int a;
    private int b;


    public StringStorage(int a, int b, String[] array) {
        this.array = array;
        this.a = a;
        this.b = b;
    }


    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
  

    public void changeOrder (){
        int len = getArray().length;

      if (a < 0 || b < 0)
      System.out.println("Unavailable index") ;

      else if (a > len -1  || b > len -1)
       System.out.println("Unavailable index") ;

      else { String tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
        System.out.println(Arrays.toString(array)); }

    }}

    

