import java.util.Scanner;

public class q7  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the matrix operation:");
        System.out.println("1. Matrix Addition");
        System.out.println("2. Matrix Multiplication");
        System.out.println("3. Matrix Transpose");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                matrixAddition(scanner);
                break;
            case 2:
                matrixMultiplication(scanner);
                break;
            case 3:
                matrixTranspose(scanner);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }

    public static void matrixAddition(Scanner scanner) {
        try {
            System.out.println("Enter the number of rows and columns for Matrix 1:");
            int rows1 = scanner.nextInt();
            int cols1 = scanner.nextInt();
            int[][] matrix1 = new int[rows1][cols1];

            System.out.println("Enter elements of Matrix 1:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter the number of rows and columns for Matrix 2:");
            int rows2 = scanner.nextInt();
            int cols2 = scanner.nextInt();
            if (rows1 != rows2 || cols1 != cols2) {
                throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
            }
            int[][] matrix2 = new int[rows2][cols2];

            System.out.println("Enter elements of Matrix 2:");
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            int[][] result = new int[rows1][cols1];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            System.out.println("Matrix Addition Result:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Accessed an element outside the matrix bounds.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void matrixMultiplication(Scanner scanner) {
        try {
            System.out.println("Enter the number of rows and columns for Matrix 1:");
            int rows1 = scanner.nextInt();
            int cols1 = scanner.nextInt();
            int[][] matrix1 = new int[rows1][cols1];

            System.out.println("Enter elements of Matrix 1:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter the number of rows and columns for Matrix 2:");
            int rows2 = scanner.nextInt();
            int cols2 = scanner.nextInt();
            if (cols1 != rows2) {
                throw new IllegalArgumentException("Number of columns in Matrix 1 must equal number of rows in Matrix 2 for multiplication.");
            }
            int[][] matrix2 = new int[rows2][cols2];

            System.out.println("Enter elements of Matrix 2:");
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            int[][] result = new int[rows1][cols2];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < cols1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            System.out.println("Matrix Multiplication Result:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Accessed an element outside the matrix bounds.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void matrixTranspose(Scanner scanner) {
        try {
            System.out.println("Enter the number of rows and columns for Matrix:");
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            int[][] matrix = new int[rows][cols];

            System.out.println("Enter elements of Matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            int[][] transpose = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

            System.out.println("Matrix Transpose Result:");
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Accessed an element outside the matrix bounds.");
        }
    }
}
