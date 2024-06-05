package chessSystem.boardgame;


public class Position {
    
    private Integer row;
    private Integer column;

    public Position(){
    }

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
    
    public void setValues(int row, int column){
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(row + "," + column);
        return sb.toString();
    }
}
