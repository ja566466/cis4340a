import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J_Fixed {
    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL; // Mask to handle unsigned integers
    }
}

