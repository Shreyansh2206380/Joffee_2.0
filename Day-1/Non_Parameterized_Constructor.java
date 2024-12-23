class Student {
    String name;
    int age;

    Student() {
        System.out.println("Constructor called");
        this.name = "Unknown";
        this.age = 0;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Non_Parameterized_Constructor {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("\nStudent Details:");
        student.displayDetails();
    }
}
