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
}
