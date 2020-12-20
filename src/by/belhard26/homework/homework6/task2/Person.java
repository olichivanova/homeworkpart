package by.belhard26.homework.homework6.task2;

public class Person {
    private String namePerson;
    private Pet pet;

    public Person(String namePerson, Pet pet) {
        this.namePerson = namePerson;
        this.pet = pet;
    }
    public Person (String namePerson) {
       this(namePerson, null);
    }
    public void play () {
        play(this.pet);
    }
    public void play (Pet pet) {
        System.out.println(namePerson + " is playing with " + (pet != null ? pet : "nothing" ));
    }

    public Pet getPet() {
        return pet;
    }
    @Override
    public String toString (){
        return String.format("%s has %s" , namePerson, pet != null ? "pet " + pet : " no pet " );
    }
}