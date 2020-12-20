package by.belhard26.homework.homework6.task2;

public abstract  class AbstractPet implements Pet {

    private String name;

    public AbstractPet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
