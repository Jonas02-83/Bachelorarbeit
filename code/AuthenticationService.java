public interface AuthenticationService {
    /**
     * Retrieves user data from the database based on the provided email.
     *
     * @param email The email of the user.
     * @return User data including email and hashed password.
     */
    User retrieveUserData(String email);

    /**
     * Compares the provided password with the hashed password from the database.
     *
     * @param password The provided password.
     * @param hashedPassword The hashed password from the database.
     * @return true if the passwords match, false otherwise.
     */
    boolean comparePasswords(String password, String hashedPassword);
}
