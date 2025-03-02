// Fixed version of MET01-J: Replaced assertions with exception handling.

public class R06_MET01_J_Fixed {
    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException();
        }
        return absX + absY;
    }
}

