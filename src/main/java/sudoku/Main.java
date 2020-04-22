package sudoku;

public class Main {

  /**
   * Main program.
   */
  public static void main(String[] args) {
    System.out.println("+-----------------------------------------------------------+");
    System.out.println("| JaSSOO - Java Sudoku Solver with Object-Oriented approach |");
    System.out.println("+-----------------------------------------------------------+");
    int[][] data =
        new int[][] {
          {0, 0, 0, 0, 0, 0, 2, 0, 0},
          {0, 8, 0, 0, 0, 7, 0, 9, 0},
          {6, 0, 2, 0, 0, 0, 5, 0, 0},
          {0, 7, 0, 0, 6, 0, 0, 0, 0},
          {0, 0, 0, 9, 0, 1, 0, 0, 0},
          {0, 0, 0, 0, 2, 0, 0, 4, 0},
          {0, 0, 5, 0, 0, 0, 6, 0, 3},
          {0, 9, 0, 4, 0, 0, 0, 7, 0},
          {0, 0, 6, 0, 0, 0, 0, 0, 0}
        };
    Board board = new Board(data);
    System.out.println(board);
  }
}
