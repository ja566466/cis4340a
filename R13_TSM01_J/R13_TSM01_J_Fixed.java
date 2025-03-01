public class R13_TSM01_J_Fixed {
    private final Thread thread;

    private R13_TSM01_J_Fixed() {
        thread = new Thread(() -> doWork());
    }

    public static R13_TSM01_J_Fixed createAndStart() {
        R13_TSM01_J_Fixed instance = new R13_TSM01_J_Fixed();
        instance.thread.start(); // Thread starts after object is fully constructed
        return instance;
    }

    private void doWork() {
        System.out.println("Working...");
    }
}

