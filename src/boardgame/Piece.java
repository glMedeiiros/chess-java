package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; //Por padrão o java já coloca o valor nulo
    }

    protected Board getBoard() {
        return board;
    }


}
