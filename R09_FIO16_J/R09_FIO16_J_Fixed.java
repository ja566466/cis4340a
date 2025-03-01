import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

public class R09_FIO16_J_Fixed {
    public static void main(String[] args) throws IOException {
        File file = new File(System.getProperty("user.home") + "/secureFile.txt"); // Secure location

        Files.setPosixFilePermissions(file.toPath(), Set.of(
                PosixFilePermission.OWNER_READ, 
                PosixFilePermission.OWNER_WRITE
        ));

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Sensitive data");
        }
    }
}

