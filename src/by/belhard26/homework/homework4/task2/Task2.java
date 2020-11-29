package by.belhard26.homework.homework4.task2;
 import by.belhard26.homework.homework4.task2.Player;
public class Task2 {
    public static void main(String[] args) {
        int xmax= 6;
        int xmin = 0;
        int ymax = 8;
        int ymin = 1;

        Player player1 = new Player("Oleg");

        System.out.println(player1.name);
        player1.move ();
        player1.move();

        Player player2 = new Player("Mark");

        System.out.println(player2.name);
        player2.move ();
        player2.move();

       
    }
}
