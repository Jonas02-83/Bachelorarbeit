public interface GameManagerLogic {
    /**
     * Validates user credentials by checking the database.
     *
     * @param email    The email of the user.
     * @param password The password of the user.
     * @return true if the user is validated, false otherwise.
     */
    boolean validateUser(String email, String password);

    /**
     * Processes a move request.
     *
     * @param playerID   The ID of the player making the move.
     * @param figureID   The ID of the figure being moved.
     * @param startFieldID The starting field ID of the figure.
     * @param endFieldID   The ending field ID of the figure.
     * @return a response indicating the result of the move.
     */
    MoveResponse processMove(int playerID, int figureID, int startFieldID, int endFieldID);

}

