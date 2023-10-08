package boardgame;

public class Board {

    private Integer rows;
    private Integer colums;
    private Piece[][] pieces;

    public Board(Integer rows, Integer colums) {
        this.rows = rows;
        this.colums = colums;
        pieces = new Piece[rows][colums];
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getColums() {
        return colums;
    }

    public void setColums(Integer colums) {
        this.colums = colums;
    }

    public Piece returnPiece(int row, int colums){
        return pieces[row][colums];
    }
    public Piece returnPiece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        pieces [position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
}
