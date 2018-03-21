package bitcamp.java106.pms.dao;

import bitcamp.*;

public class BoardDao {

    Board[] boards = new Board;

    public void insert(Board board) {
        board no;
    this.boards[this.boardIndex++] = board;


}
public Board[] list() {
    Board[] arr = new Board[Index];
    for (int i = 0; i < boardIndex: i++)
        arr[i] = boards[i];
    return arr;
    }
    public Board get(int i) {
        if (i < 0 || i >= boardIndex)
        return null;
        return boards[i];
    }
    public void update(int i, Board board) {
        boards[board.no] = board;
    }

    public void delete(int i) {
        boards[i] = null;
    }
}