class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Parameterized_Constructor {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 19);
        Student student2 = new Student("Bob", 20);

        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();
    }
}
