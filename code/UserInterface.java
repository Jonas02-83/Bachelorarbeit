public interface UserInterface {
    /**
     * Requests to log in the user with the provided email and password.
     *
     * @param email    The email of the user.
     * @param password The password of the user.
     */
    void login(String email, String password);

    /**
     * Displays the login result to the user.
     *
     * @param success true if login was successful, false otherwise.
     */
    void displayLoginResult(boolean success);
}
