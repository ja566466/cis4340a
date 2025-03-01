import java.io.File;

public class R02_XP00_J_Fixed {
    public void deleteFile() {
        File someFile = new File("someFileName.txt");
        if (!someFile.delete()) {
            System.err.println("Failed to delete file!");
        }
    }
}

