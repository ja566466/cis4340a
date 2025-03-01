import java.io.*;

public class R14_SER03_J_Defective {
    public static Object deserialize(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return ois.readObject(); // Unsafe deserialization
        }
    }
}

