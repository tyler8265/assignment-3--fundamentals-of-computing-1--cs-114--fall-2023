import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
  private static int[][] matrix = new int[0][0];
  private static int size, value, rows, columns;

  public static void matrix() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter the size of your matrix: ");
    int size = scan.nextInt();

    System.out.println();
    System.out.println("Your matrix is " + size + " x " + size);
    System.out.println();

    matrix = new int[size][size];
  }

  private static void swap() {

  }

  public static void printMatrix() {
    System.out.println("Printing matrix with default values: ");
    for(int i = 0; i < matrix.length; i++){
      System.out.println();
      for(int j = 0; j < matrix.length; j++)
        System.out.print(matrix[i][j] + "\t");
    }
  }

  public static void populateMatrix() {
    System.out.println("Populating matrix...matrix populated");
    System.out.println();
    System.out.println("Printing matrix: ");

    size = (matrix.length * matrix.length);
    do {
        for (int x = 0; x < matrix.length; x++){
        matrix[rows][columns] = value++;
        columns++;
      }
      rows++;
    } while (rows < matrix.length);
    for(int i = 0; i < matrix.length; i++){
      System.out.println();
      for(int j = 0; j < matrix.length; j++)
        System.out.print(matrix[i][j] + "\t");
    }
  }


}
