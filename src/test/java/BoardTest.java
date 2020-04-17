import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {

    @Test public void testGetData() {
        int[][] data = new int[][]{
            {0, 0, 0, 0, 0, 0, 2, 0, 0},
            {0, 8, 0, 0, 0, 7, 0, 9, 0},
            {6, 0, 2, 0, 0, 0, 5, 0, 0},
            {0, 7, 0, 0, 6, 0, 0, 0, 0},
            {0, 0, 0, 9, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 2, 0, 0, 4, 0},
            {0, 0, 5, 0, 0, 0, 6, 0, 3},
            {0, 9, 0, 4, 0, 0, 0, 7, 0},
            {0, 0, 6, 0, 0, 0, 0, 0, 0}};
        Board board = new Board(data);
        assertArrayEquals(data, board.getData());
    }

    @Test public void testGetIndex() {
        int[][] data = new int[][]{
            {0, 0, 0, 0, 0, 0, 2, 0, 0},
            {0, 8, 0, 0, 0, 7, 0, 9, 0},
            {6, 0, 2, 0, 0, 0, 5, 0, 0},
            {0, 7, 0, 0, 6, 0, 0, 0, 0},
            {0, 0, 0, 9, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 2, 0, 0, 4, 0},
            {0, 0, 5, 0, 0, 0, 6, 0, 3},
            {0, 9, 0, 4, 0, 0, 0, 7, 0},
            {0, 0, 6, 0, 0, 0, 0, 0, 0}};
        Board board = new Board(data);
        assertEquals(6, board.getIndex(2,0));
    }

}

