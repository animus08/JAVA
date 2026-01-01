class Bus implements Runnable {

    int availableSeat = 1; // only 1 seat available
    int passenger; // passenger trying to book seat

    Bus(int passenger) {
        this.passenger = passenger;
    }

    public synchronized void run() {
        String name = Thread.currentThread().getName();

        if (availableSeat >= passenger) {
            System.out.println(name + " reserved the seat!");
            availableSeat = availableSeat - passenger;
        } else {
            System.out.println(name + " sorry, seat not available!");
        }
    }
}

class Synchronization {

    public static void main(String[] args) {

        Bus b = new Bus(1); // 1 passenger per booking

        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);

        t1.setName("Ram");
        t2.setName("Shyam");
        t3.setName("Mohan");

        t1.start();
        t2.start();
        t3.start();
    }
}



// Now code for the Synchronized Block
// package Multithreading;
// class Bus implements Runnable {

//     int availableSeat = 1; // only 1 seat available
//     int passenger; // passenger trying to book seat

//     Bus(int passenger) {
//         this.passenger = passenger;
//     }

//     public void run() {
//         String name = Thread.currentThread().getName();

//         synchronized (this) {
//             if (availableSeat >= passenger) {
//                 System.out.println(name + " reserved the seat!");
//                 availableSeat = availableSeat - passenger;
//             } else {
//                 System.out.println(name + " sorry, seat not available!");
//             }
//         }
//     }
// }