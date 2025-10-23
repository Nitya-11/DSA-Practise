
    import java.util.Scanner;

public class ComplexMatrixMultiplication {

    // Function to multiply two n x n matrices
    static int[][] multiply(int[][] X, int[][] Y, int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    result[i][j] += X[i][k] * Y[k][j];
                }
            }
        }
        return result;
    }

    // Function to add two n x n matrices
    static int[][] add(int[][] X, int[][] Y, int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = X[i][j] + Y[i][j];
            }
        }
        return result;
    }

    // Function to subtract two n x n matrices
    static int[][] subtract(int[][] X, int[][] Y, int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = X[i][j] - Y[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter matrix size (n): ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];
        int[][] D = new int[n][n];

        // Input A
        System.out.println("Enter matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input B
        System.out.println("Enter matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Input C
        System.out.println("Enter matrix C:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = sc.nextInt();
            }
        }

        // Input D
        System.out.println("Enter matrix D:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                D[i][j] = sc.nextInt();
            }
        }

        // Compute AC, BD, AD, BC
        int[][] AC = multiply(A, C, n);
        int[][] BD = multiply(B, D, n);
        int[][] AD = multiply(A, D, n);
        int[][] BC = multiply(B, C, n);

        // Real part = AC - BD
        int[][] realPart = subtract(AC, BD, n);

        // Imaginary part = AD + BC
        int[][] imagPart = add(AD, BC, n);

        // Print result
        System.out.println("Resulting complex matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("(" + realPart[i][j] + " + i" + imagPart[i][j] + ") ");
            }
            System.out.println();
        }

        sc.close();
    }
}


