import java.util.logging.Logger;

public class R00_IDS03_J_Defective {
    private static final Logger logger = Logger.getLogger(R00_IDS03_J_Defective.class.getName());

    public static void logUser(String username, boolean loginSuccessful) {
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }
}
