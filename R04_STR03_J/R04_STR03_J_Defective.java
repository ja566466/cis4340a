import java.math.BigInteger;

public class R04_STR03_J_Defective {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray); // Incorrect usage
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);
    }
}

