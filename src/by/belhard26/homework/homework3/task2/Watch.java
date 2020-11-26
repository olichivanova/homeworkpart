package by.belhard26.homework.homework3.task2;

public class Watch {
    public String brand;
    public int reference;
    public String movement;
    public Modelcase modelcase;
    public String bracelet;
    public Mark mark;

    public Watch (String brand, int reference, String movement, Modelcase modelcase, String bracelet, Mark mark) {
        this.brand = brand;
        this.reference = reference;
        this.movement = movement;
        this.modelcase = modelcase;
        this.bracelet = bracelet;
        this.mark = mark;   }


        public String toString() {
            return " ======= " +
                    " Brand: " + brand +
                    " Reference " + reference +
                    " Movement " + movement +
                    " Diameter of case " + modelcase.diameter +
                    " Material of case " + modelcase.material +
                     " Material of bracelet " + bracelet +
                    " Additional information " + mark +
                    " ======== "; }

                    public void waterResistence (int metre)   {
                        System.out.println( " Waterproof " + metre + " metres " );

                    }

                    public void aslooklike () {
                        System.out.println( " You can find more models as you may also like ");
                    }
                        
        }


