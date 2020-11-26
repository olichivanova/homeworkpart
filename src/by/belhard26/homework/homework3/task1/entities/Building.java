package by.belhard26.homework.homework3.task1.entities;

public class Building {
    public String functional;
    public Address address;
    public int floor;
    public boolean lift;
    public String material;
    public int year;


    public Building (String functional, Address address, int floor, boolean lift, String material, int year ) {
        this.functional = functional;
        this.address = address;
        this.floor = floor;
        this.lift = lift;
        this.material = material;
        this.year = year;  }

        public String toString() {
         return "========" +
         "Functional " + functional +
         " Street "  + address.street +
         " Number "  + address.number +
         " Floor "  + floor +
         " Lift " + lift +
         " Material " + material +
         " Year " + year +
         " ========";


        }                    }

    
    
    

