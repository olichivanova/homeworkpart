package by.belhard26.homework.homework3.task3;
  
public class ArraysCalculator {
    public  int[] sumArray(int[] array1, int[] array2) {
        int [] sumArrays = new int[Math.max(array1.length, array2.length)];
        for ( int i = 0; i < sumArrays.length; i++) {
            if (i > array1.length - 1)
                sumArrays [i] = array2[i];
            
            else
            sumArrays [i] = array1[i] + array2[i];   
        }

        return
                sumArrays ;
    }

    public void  concatArrays  (int[] array1, int[] array2)   {
        
      if (array1.length > array2.length)  {
        for (int i = 0; i < array2.length; i++ ) {
            System.out.print(array1[i] +" ");
            System.out.println(array2[i] + " "); }

           for (int i = array2.length - 1; i < array1.length; i++)
               System.out.print (array1 [i]  + " ");
        }
        
       if (array2.length > array1.length)  {
            for (int i = 0; i < array1.length; i++ ) {
                System.out.print(array2[i] + " ");
                System.out.print(array1[i] + " "); }
            for    (int i = array1.length-1; i < array2.length; i++)
                    System.out.print (array2 [i] + " ");

        } 

    }
}     






