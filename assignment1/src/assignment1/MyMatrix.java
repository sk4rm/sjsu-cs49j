package assignment1;

public class MyMatrix {
    private final int[][] matrix;

    public MyMatrix(int[][] array) {
        matrix = array.clone();
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public MyMatrix multiply(MyMatrix other) {
        int[][] result = new int[matrix.length][other.matrix[0].length];

        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < other.matrix[i].length; j++) {
                for (int k = 0; k < other.matrix.length; k++) {
                    result[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }

        return new MyMatrix(result);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : this.matrix) {
            for (int cell : row) {
                sb.append(cell);
                sb.append(" ");
            }
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
