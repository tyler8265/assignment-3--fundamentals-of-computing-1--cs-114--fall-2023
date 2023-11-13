import java.util.Scanner;

public class Matrix {
  private static int[][] matrix = new int[0][0];
  private static int size, value, rows, columns, j;

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
    rows = 0;
    columns = matrix.length - 1;
    for(int i = 0; i < matrix.length; i++){
      matrix[rows][columns] = 1;
      rows++;
      columns--;
    }

    System.out.println("Printing matrix with default values: ");
    for(int i = 0; i < matrix.length; i++){
      System.out.println();
      for(int j = 0; j < matrix.length; j++)
        System.out.print(matrix[i][j] + "\t");
    }
    System.out.println();
  }

   public static void populateMatrix() {
    System.out.println("Populating matrix...matrix populated");
    System.out.println();
    System.out.println("Printing matrix: ");

    size = (matrix.length * matrix.length);
    rows = 0;
    columns = 0;
    do {
      for (int x = 0; x < matrix.length; x++){
        matrix[rows][columns] = value++;
        columns++;
      }
      rows++;
      columns = 0;
    }
    while (rows < matrix.length);

    for(int i = 0; i < matrix.length; i++){
      System.out.println();
      for(int j = 0; j < matrix.length; j++)
        System.out.print(matrix[i][j] + "\t");
    }
  }


}
