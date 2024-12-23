class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Copy_Constructor {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 19);

        // Creating a new Student object using the copy constructor
        Student student2 = new Student(student1);

        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 Details (Copied):");
        student2.displayDetails();
    }
}
