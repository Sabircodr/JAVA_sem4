public class Emp {
    int ID;
    String name;

    // Constructor to print only ID
    public Emp(int ID) {
        this.ID = ID;
        System.out.println("Employee ID: " + ID);
    }

    // Constructor to print only name
    public Emp(String name) {
        this.name = name;
        System.out.println("Employee Name: " + name);
    }
}

public class EmpOne {
    public static void main(String[] args) {
        // Creating instances using different constructors
        Emp emp1 = new Emp(101);       // Constructor with int parameter (ID)
        Emp emp2 = new Emp("John Doe"); // Constructor with String parameter (name)
    }
}
