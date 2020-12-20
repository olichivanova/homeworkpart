package by.belhard26.homework.homework6.task2;

public class Dog extends AbstractPet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(this.getName() + " is barking and jumping");
    }
    @Override
    public String toString (){
        return String.format("Dog '%s'", getName());
    }
}
