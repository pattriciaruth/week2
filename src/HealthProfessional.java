public class HealthProfessional {
    // Instance variables
    private int ID;
    private String name;
    private String department; // Additional variable to describe the health professional

    // Default constructor
    public HealthProfessional() {
        this.ID = 0; // Default ID, can be changed if needed
        this.name = "Unknown"; // Default name
        this.department = "General"; // Default department or can be blank
    }

    // Parameterized constructor
    public HealthProfessional(int ID, String name, String department) {
        this.ID = ID;
        this.name = name;
        this.department = department;
    }

    // Method to print all instance variables
    public void printInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

