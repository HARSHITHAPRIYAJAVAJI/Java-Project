package Array;

public class Tracing {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] matrix = { {1, 2, 3},{4, 5, 6},{7, 8, 9}};

        // Trace the array by printing each element with its indices
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "] = " + matrix[i][j]);
            }
        }
    }
}