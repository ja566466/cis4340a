import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class R09_FIO16_J_Defective {
    public static void main(String[] args) throws IOException {
        File file = new File("/tmp/sharedFile.txt"); // Insecure shared location
        FileWriter writer = new FileWriter(file);
        writer.write("Sensitive data");
        writer.close();
    }
}

