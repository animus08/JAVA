// Write a program to simulate a deadlock: 
// 1. Create two threads where each thread tries to lock two shared resources in a different order. 
// 2. Demonstrate how deadlock occurs and explain how to resolve it.

public class DeadlockSimulation {
    public static void main(String[] args) {
        final Object resource1 = "Resource 1";
        final Object resource2 = "Resource 2";

        // Thread 1 locks resource1 then resource2
        Thread t1 = new Thread() {
            // @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: Locked resource 1");

                    // Simulate some work with resource1
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }

                    System.out.println("Thread 1: Waiting for resource 2");
                    synchronized (resource2) {
                        System.out.println("Thread 1: Locked resource 2");
                    }
                }
            }
        };

        // Thread 2 locks resource2 then resource1
        Thread t2 = new Thread() {
            // @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: Locked resource 2");

                    // Simulate some work with resource2
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }

                    System.out.println("Thread 2: Waiting for resource 1");
                    synchronized (resource1) {
                        System.out.println("Thread 2: Locked resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}

// To resolve the deadlock, we can enforce a consistent locking order for both threads.
// For example, both threads should lock resource1 first and then resource2.