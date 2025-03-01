import java.io.FileInputStream;
import java.io.IOException;

public class R05_OBJ11_J_Defective {
    private FileInputStream file;

    public R05_OBJ11_J_Defective(String filename) throws IOException {
        file = new FileInputStream(filename); // Exception can be thrown before full initialization
    }

    public void close() throws IOException {
        if (file != null) {
            file.close();
        }
    }
}

