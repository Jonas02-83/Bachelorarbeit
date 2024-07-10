public interface DatabaseAccess {
    /**
     * Retrieves user data from the database based on the provided email.
     *
     * @param email The email of the user.
     * @return User data including email and hashed password.
     */
    User retrieveUserData(String email);

    /**
     * Retrieves field occupancy status and the occupying figure ID.
     *
     * @param fieldID The ID of the field to check.
     * @return Occupancy status and occupying figure ID.
     */
    OccupancyStatus checkFieldOccupied(int fieldID);

    /**
     * Updates the position of a figure in the database.
     *
     * @param figureID The ID of the figure.
     * @param newFieldID The new field ID where the figure will be moved.
     */
    void updateFigurePosition(int figureID, int newFieldID);
}
