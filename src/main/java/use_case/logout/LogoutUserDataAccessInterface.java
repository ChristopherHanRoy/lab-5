package use_case.logout;

/**
 * DAO for the Logout Use Case.
 */
public interface LogoutUserDataAccessInterface {

    /**
     * Returns the username of the curren user of the application.
     * @return the username of the current user
     */
    String getCurrentEmail();

    /**
     * Sets the username indicating who is the current user of the application.
     * @param username the new current username
     */
    void setCurrentEmail(String username);
}
