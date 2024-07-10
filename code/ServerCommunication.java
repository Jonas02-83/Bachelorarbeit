public interface ServerCommunication {
    /**
     * Forwards the login request to the game manager logic.
     *
     * @param email    The email of the user.
     * @param password The password of the user.
     * @return true if login was successful, false otherwise.
     */
    boolean forwardLoginRequest(String email, String password);

    /**
     * Sends the login response to the client.
     *
     * @param success true if login was successful, false otherwise.
     */
    void sendLoginResponse(boolean success);

    /**
     * Forwards a move request to the game logic.
     *
     * @param playerID   The ID of the player making the move.
     * @param figureID   The ID of the figure being moved.
     * @param startFieldID The starting field ID of the figure.
     * @param endFieldID   The ending field ID of the figure.
     * @return a response indicating the result of the move.
     */
    MoveResponse forwardMoveRequest(int playerID, int figureID, int startFieldID, int endFieldID);

    /**
     * Sends the move response to the client.
     *
     * @param response The response from the game logic.
     */
    void sendMoveResponse(MoveResponse response);
}
