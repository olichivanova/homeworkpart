package by.belhard26.homework.homework1;

public class task4 {
    public static void main(String[] args) {
       int salary1 = 20, salary2 = 12, salary3 = 5;
       int result;
       if (salary1 > salary2 && salary1 > salary3)  {
           if (salary2 < salary3)   {
               result = salary1 - salary2;
               System.out.println(result); }
           else   { result = salary1 - salary3;
               System.out.println(result);} }
      if (salary2 > salary1 && salary2 > salary3) {
          if (salary1 < salary3) {
              result = salary2 - salary1;
              System.out.println(result); }
          else { result = salary2 - salary3;
              System.out.println(result); } }
      if (salary3 > salary1 && salary3 > salary2) {
          if (salary1 < salary2)   {
              result = salary3 - salary1;
              System.out.println(result); }
          else { result = salary3 - salary2;
              System.out.println(result);}

      }
    }


    }

