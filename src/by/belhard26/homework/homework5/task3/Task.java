package by.belhard26.homework.homework5.task3;


import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
            StringStorage array1 = new StringStorage(0, 2, new String[] {"terrace", "vase", "table", "chair", "carpet", "picture"});
        System.out.println(Arrays.toString(array1.getArray()));


        array1.changeOrder();
    }
}
