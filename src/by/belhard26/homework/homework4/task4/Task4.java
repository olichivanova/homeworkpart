package by.belhard26.homework.homework4.task4;

public class Task4 {
    public static void main(String[] args) {
        int x = 7;
        String array [] = {"flat", "apartment", "building", "office", "house"};
        
        for (int i = 0; i < array.length; i++ )  {
            if (array[i].length() >= x)
                System.out.println(array[i]);
        }
    }
}
