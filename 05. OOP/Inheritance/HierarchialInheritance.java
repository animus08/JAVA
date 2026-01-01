class HierarchialInheritance {
    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends HierarchialInheritance {
    void carShow() {
        System.out.println("This is a car");
    }
}

class Bike extends HierarchialInheritance{

    void bikeShow() {
        System.out.println("This is a bike");
    }

    public static void main(String[] args) {
        Car carObj = new Car();
        carObj.display();
        carObj.carShow();

        Bike bikeObj = new Bike();
        bikeObj.display();
        bikeObj.bikeShow();
    }
}
