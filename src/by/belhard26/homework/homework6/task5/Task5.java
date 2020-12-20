package by.belhard26.homework.homework6.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {

        List<String>  strings = Arrays.asList(
                "maxim", "vasily", "igor", "muka", "impichment", "otniud"
        );
        List<String> result1 = getStringContainChar(strings,'a' );
        System.out.println(result1);
        List<String> result2 = getStringContainChar(strings, 'i') ;
        System.out.println(result2);
        
    }

   private  static List<String> getStringContainChar ( List<String> strings, char c){
     List<String> result = new ArrayList<>();
       for (String s: strings) {
         if (s.contains("" + c))
             result.add (s);
       }
       return result;
   } }