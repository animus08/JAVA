class StudentEncap {
    private String name;
    private int age;
    StudentEncap(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayDetails() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        StudentEncap student = new StudentEncap("Anuj", 21);
        student.displayDetails();
    }
}
