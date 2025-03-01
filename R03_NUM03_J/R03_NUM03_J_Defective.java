
import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J_Defective {
    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt();
    }
}
