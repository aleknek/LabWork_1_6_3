
public class Main {

    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        int valueMatrix = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = valueMatrix++;
            }
        }

        // output matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
