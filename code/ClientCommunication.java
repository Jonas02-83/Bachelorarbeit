public interface ClientCommunication {
    /**
     * Forwards the login request to the server.
     *
     * @param email    The email of the user.
     * @param password The password of the user.
     */
    void forwardLoginRequest(String email, String password);

    /**
     * Receives the login response from the server.
     *
     * @param success true if login was successful, false otherwise.
     */
    void receiveLoginResponse(boolean success);

    /**
     * Sends a move request to the server.
     *
     * @param playerID   The ID of the player making the move.
     * @param figureID   The ID of the figure being moved.
     * @param startFieldID The starting field ID of the figure.
     * @param endFieldID   The ending field ID of the figure.
     */
    void sendMoveRequest(int playerID, int figureID, int startFieldID, int endFieldID);

    /**
     * Receives the move response from the server.
     *
     * @param response The response from the server.
     */
    void receiveMoveResponse(MoveResponse response);
}
