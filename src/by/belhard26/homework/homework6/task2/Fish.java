package by.belhard26.homework.homework6.task2;

public class Fish extends AbstractPet {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(this.getName() + "is swimming in a circle");
    }

    @Override
    public String toString (){
        return String.format("Dog '%s'", getName());
    }
}
