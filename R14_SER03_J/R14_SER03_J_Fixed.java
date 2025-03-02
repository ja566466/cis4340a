// Fixed version of SER03-J: Validated deserialized objects to prevent untrusted data execution.

import java.io.*;

public class R14_SER03_J_Fixed {
    public static Object deserialize(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Object obj = ois.readObject();
            if (validateClass(obj)) {
                return obj;
            } else {
                throw new SecurityException("Invalid serialized object");
            }
        }
    }

    private static boolean validateClass(Object obj) {
        return obj instanceof SafeClass; // Only allow safe classes
    }
}

class SafeClass implements Serializable {
    private static final long serialVersionUID = 1L;
}

