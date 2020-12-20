package by.belhard26.homework.homework6.task2;

public class Cat extends AbstractPet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(this.getName() + "is mewling");
    }
    @Override
    public String toString (){
        return String.format("Cat '%s'", getName());
    }

}
