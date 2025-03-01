public class R12_THI00_J_Defective {
    public static void main(String[] args) {
        Thread task = new Thread(() -> {
            System.out.println("Running in: " + Thread.currentThread().getName());
        });

        task.run(); // Incorrect: Runs in the main thread
    }
}

