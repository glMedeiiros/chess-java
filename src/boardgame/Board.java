package boardgame;

public class Board {

    private Integer rows;
    private Integer columns;
    private Piece[][] pieces;

    public Board(Integer rows, Integer columns) {

        if(rows < 8 || columns < 8) {
            throw new BoardException("Error creating board: there must be at least 8 rows and 8 columns");
        }

        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public Integer getRows() {
        return rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public Piece returnPiece(int row, int columns){
        if(!positionExists(row, columns)){
            throw new BoardException("Position not on the board");
        }
        return pieces[row][columns];
    }
    public Piece returnPiece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        if(thereisAPiece(position)){
            throw new BoardException("There is already a piece on position " + position);
        }
        pieces [position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public boolean positionExists(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereisAPiece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        return returnPiece(position) != null;
    }
}
