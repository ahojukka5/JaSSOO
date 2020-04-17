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
        sb.append("+-------+-------+-------+\n");
        for (int i = 0; i < 9; i++) {
            sb.append("|");
            for (int j = 0; j < 9; j++) {
                sb.append(" " + (data[i][j] != 0 ? data[i][j] : " "));
                if (j % 3 == 2) {
                    sb.append(" |");
                }
            }
            sb.append("\n");
            if (i % 3 == 2) {
                sb.append("+-------+-------+-------+\n");
            }
        }
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
