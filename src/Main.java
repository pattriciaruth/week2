public class Main {
    public static void main(String[] args) {
        // Using the default constructor
        HealthProfessional hp1 = new HealthProfessional();
        hp1.printInfo();

        System.out.println();

        // Using the parameterized constructor
        HealthProfessional hp2 = new HealthProfessional(101, "Dr. John Smith", "Cardiology");
        hp2.printInfo();
    }
}

