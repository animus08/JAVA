class SimpleInheritance {
    int roll, marks;
    String name;
    void input(){
        System.out.println("This is a simple inheritance example.");
    }
}
class SubClass extends SimpleInheritance{
    void display(){
        roll = 1;
        name = "John Doe";
        marks = 95;
        System.out.println("Roll: " + roll + ", Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args){
        SubClass obj = new SubClass();
        obj.input();
        obj.display();
    }
}
