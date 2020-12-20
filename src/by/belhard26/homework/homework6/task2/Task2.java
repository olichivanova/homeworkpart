package by.belhard26.homework.homework6.task2;

public class Task2 {
    public static void main(String[] args) {

       Pet dog = new Dog( "Sharik");
       Pet cat = new Cat("Matroskin");
       Pet fish = new Fish("Nemo");

       Person person = new Person("Vasiliy", dog);
       Person person1 = new Person("Tatyana", cat);
       Person person2 = new Person("Igor");

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println();

        person.play();;
        person1.play();
        person2.play();
        System.out.println();
        person.play(person1.getPet());
        person2.play(fish);

    }
}
