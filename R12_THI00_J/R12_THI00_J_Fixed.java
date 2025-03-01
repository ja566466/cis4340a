public class R12_THI00_J_Fixed {
    public static void main(String[] args) {
        Thread task = new Thread(() -> {
            System.out.println("Running in: " + Thread.currentThread().getName());
        });

        task.start(); // Correct: Runs in a new thread
    }
}

