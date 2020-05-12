package sudoku;

public class Board {

  private int[][] data;

  public Board() {
    this.data = new int[9][9];
  }

  public Board(int[][] data) {
    this.data = data;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 9; i++) {
      if (i % 3 == 0) {
        sb.append("+-------+-------+-------+\n");
      }
      for (int j = 0; j < 9; j++) {
        if (j % 3 == 0) {
          sb.append("| ");
        }
        if (data[i][j] == 0) {
          sb.append(" ");
        } else {
          sb.append(data[i][j]);
        }
        sb.append(" ");
      }
      sb.append("|\n");
    }
    sb.append("+-------+-------+-------+");
    return sb.toString();
  }

  public int[][] getData() {
    return data;
  }

  public void setData(int[][] data) {
    this.data = data;
  }

  public int getIndex(int i, int j) {
    return data[i][j];
  }

  public void setIndex(int i, int j, int v) {
    data[i][j] = v;
  }

  /**
   * Check to see if there is a number given on a arbitrary row of sudoku.
   *
   * @param row    number row, 0 .. 8
   * @param number to look for
   * @return true / false
   */
  public boolean hasInRow(int row, int number) {
    for (int i = 0; i < 9; i++) {
      if (data[row][i] == number) {
        return true;
      }
    }
    return false;
  }

  /**
   * Check to see if there is a number given on a arbitrary column of sudoku.
   *
   * @param column number of column, 0 .. 8
   * @param number to look for
   * @return true / false
   */
  public boolean hasInColumn(int column, int number) {
    for (int i = 0; i < 9; i++) {
      if (data[i][column] == number) {
        return true;
      }
    }
    return false;
  }

  /**
   * Check to see if there is a number given on a arbitrary cell of sudoku. By
   * cell in this context is meant a 3x3 sub-problem of sudoku.
   *
   * @param cx     cell number in horizontal direction, {0, 1, 2}
   * @param cy     cell number in vertical direction, {0, 1, 2}
   * @param number to look for
   * @return true / false
   */
  public boolean hasInCell(int cx, int cy, int number) {
    for (int i = 3 * cx; i < 3 * (cx + 1); i++) {
      for (int j = 3 * cy; j < 3 * (cy + 1); j++) {
        if (data[i][j] == number) {
          return true;
        }
      }
    }
    return false;
  }
}
