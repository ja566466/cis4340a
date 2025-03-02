// Fixed version of THI00-J: Used Thread.start() instead of Thread.run().

public class R12_THI00_J_Fixed {
    public static void main(String[] args) {
        Thread task = new Thread(() -> {
            System.out.println("Running in: " + Thread.currentThread().getName());
        });

        task.start(); // Correct: Runs in a new thread
    }
}

