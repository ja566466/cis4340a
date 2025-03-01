public class R13_TSM01_J_Defective {
    private final Thread thread;

    public R13_TSM01_J_Defective() {
        thread = new Thread(() -> doWork());
        thread.start(); // "this" escapes before constructor is done
    }

    private void doWork() {
        System.out.println("Working...");
    }
}

