package by.belhard26.homework.homework10.task1;

import java.io.*;
import java.util.ArrayList;

public class Task1 {
    private static final String PATH = "resourses/inlisttask1";
    private static final String PATH2 = "resourses/outlisttask1";


    public static void main(String[] args) {
        String sb = new String();
        String forout = new String();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(PATH));
            
            while (reader.ready()){
               String s = reader.readLine();
               sb += s;}
               String[] num = sb.split(" ");
               int [] array = new int[num.length];
               int [] array2 = new int[num.length];
               for (int i = 0; i < num.length; i++){
                   array[i] = Integer.parseInt(num[i]);
                System.out.println(array[i]);
               array2[i] = array [i] * array[i] * array[i]; }
            System.out.println();
            for (int i = 0; i < array2.length; i++)
                System.out.println(array2[i]);
            System.out.println();
            for (int i = 0; i < array2.length; i++)
            forout += Integer.toString(array2[i]) + " ";
            System.out.println(forout);

            reader.close();
            }
        catch (IOException e) {
            e.printStackTrace();
        }
       try {
           BufferedWriter st = new BufferedWriter(new FileWriter(PATH2));
           st.write(forout);
           st.close();
       }
        catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

