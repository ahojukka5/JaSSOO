package sudoku;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

// +-------+-------+-------+
// |       |       | 2     |
// |   8   |     7 |   9   |
// | 6   2 |       | 5     |
// +-------+-------+-------+
// |   7   |   6   |       |
// |       | 9   1 |       |
// |       |   2   |   4   |
// +-------+-------+-------+
// |     5 |       | 6   3 |
// |   9   | 4     |   7   |
// |     6 |       |       |
// +-------+-------+-------+

public class BoardTest {

    private transient int[][] data;
    private transient Board board;

    private int[][] getData() {
        return data;
    }

    private Board getBoard() {
        return board;
    }

    @Before
    public void init() {
        this.data = new int[][]{
            {0, 0, 0, 0, 0, 0, 2, 0, 0},
            {0, 8, 0, 0, 0, 7, 0, 9, 0},
            {6, 0, 2, 0, 0, 0, 5, 0, 0},
            {0, 7, 0, 0, 6, 0, 0, 0, 0},
            {0, 0, 0, 9, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 2, 0, 0, 4, 0},
            {0, 0, 5, 0, 0, 0, 6, 0, 3},
            {0, 9, 0, 4, 0, 0, 0, 7, 0},
            {0, 0, 6, 0, 0, 0, 0, 0, 0}};
        this.board = new Board(data);
    }

    @Test public void testGetData() {
        assertArrayEquals(getData(), getBoard().getData());
    }

    @Test public void testGetIndex() {
        assertEquals(6, getBoard().getIndex(2,0));
    }

}

