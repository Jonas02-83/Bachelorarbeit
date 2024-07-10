public interface GameService {
    /**
     * Validates a move request.
     *
     * @param playerID   The ID of the player making the move.
     * @param figureID   The ID of the figure being moved.
     * @param startFieldID The starting field ID of the figure.
     * @param endFieldID   The ending field ID of the figure.
     * @return true if the move is valid, false otherwise.
     */
    boolean validateMove(int playerID, int figureID, int startFieldID, int endFieldID);

    /**
     * Checks if a field is occupied.
     *
     * @param fieldID The ID of the field to check.
     * @return true if the field is occupied, false otherwise.
     */
    boolean isFieldOccupied(int fieldID);

    /**
     * Moves the figure to the new position.
     *
     * @param figureID The ID of the figure being moved.
     * @param newFieldID The new field ID where the figure will be moved.
     */
    void moveFigure(int figureID, int newFieldID);

    /**
     * Moves the occupying figure back to its start position.
     *
     * @param figureID The ID of the occupying figure.
     */
    void moveOccupyingFigureToStart(int figureID);
}
