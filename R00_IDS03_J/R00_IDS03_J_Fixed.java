import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J_Fixed {
    private static final Logger logger = Logger.getLogger(R00_IDS03_J_Fixed.class.getName());

    public static void logUser(String username, boolean loginSuccessful) {
        String sanitizedUser = sanitizeUser(username);
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizedUser);
        } else {
            logger.severe("User login failed for: " + sanitizedUser);
        }
    }

    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9]+", username) ? username : "unauthorized user";
    }
}

