// Fixed version of OBJ11-J: Used static factory method instead of throwing exceptions in constructor.

import java.io.FileInputStream;
import java.io.IOException;

public class R05_OBJ11_J_Fixed {
    private FileInputStream file;

    private R05_OBJ11_J_Fixed(FileInputStream file) {
        this.file = file;
    }

    public static R05_OBJ11_J_Fixed createInstance(String filename) throws IOException {
        FileInputStream file = new FileInputStream(filename);
        return new R05_OBJ11_J_Fixed(file);
    }

    public void close() throws IOException {
        if (file != null) {
            file.close();
        }
    }
}

