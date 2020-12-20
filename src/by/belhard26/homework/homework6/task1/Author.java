package by.belhard26.homework.homework6.task1;

public class Author {

 private static final String DEFAULT_NAME = "No name";
 private static final  String DEFAULT_LASTNAME = " no lastName";
 private static final   Integer DEFAULT_AGE = 40;


    private String name;
    private String lastName;
    private int age;

   public Author(String name, String lastName, int age) {
       if (name == null || name.isEmpty())
           name = DEFAULT_NAME;
       if ( lastName == null || lastName.isEmpty())
           lastName = DEFAULT_LASTNAME;
       if (age < 2 )
           age = DEFAULT_AGE;
        this.name = name;
        this.lastName = lastName;
        this.age = age;

   }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
