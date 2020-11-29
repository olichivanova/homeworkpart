package by.belhard26.homework.homework4.task2;

import java.util.Random;

public class Player {


    static int x1 ;
   static int y1 ;
    static double distance1 ;
    String name;
    int x2;
    int y2;
    int xmax;
    int ymax;
    int xmin;
    int ymin;

    public Player( String name) {
        this. x1 = 2;
        this.y1 = 3;
        this.distance1 = 0;
        this.name = name;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.xmax = xmax;
        this.ymax = ymax;
        this.xmin = xmin;
        this.ymin = ymin;
    }


   public void move (){
       int xmax= 6;
       int xmin = 0;
       int ymax = 8;
       int ymin = 1;
       System.out.println("x1 " + x1);
       System.out.println("y1 " + y1);
       System.out.println("sum distance" + distance1);
       Random random = new Random();
                int diff1 = xmax - xmin;
        int diff2 = ymax - ymin;
      x2 = random.nextInt(diff1+1);
      y2 = random.nextInt(diff2+1);
       System.out.print(" New coordinate (" + x2 +  "; " );
       System.out.println(y2 + " )" );
       double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2-y1),2));
       System.out.println( " disrance " +distance);
       
       x1 = x2;
       y1 = y2;
       distance1 = distance1 + distance;
       System.out.println("sum distance" + distance1);

       }


   }


