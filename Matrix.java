import java.util.Scanner;

public class Matrix {
  private static int[][] matrix = new int[0][0];
  private static int value, rows, columns;

  public static void matrix() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter the size of your matrix: ");
    int size = scan.nextInt();
    scan.close();

    System.out.println();
    System.out.println("Your matrix is " + size + " x " + size);
    System.out.println();

    matrix = new int[size][size];
  }

  private static void swap(int[][] matrix, int x1, int x2, int y1, int y2) {
    if (x1 + y1 == matrix.length - 1 || x2 + y2 == matrix.length - 1){
      return;
    }
    int tempArray = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = tempArray;
  }

  public static void printMatrix() {
    rows = 0;
    columns = matrix.length - 1;
    for(int i = 0; i < matrix.length; i++){
      matrix[rows][columns] = 0;
      rows++;
      columns--;
    }

    System.out.println("Printing matrix with default values: ");
    for(int i = 0; i < matrix.length; i++){
      System.out.println();
      for(int j = 0; j < matrix.length; j++){
        if(i + j == matrix.length - 1){
          System.out.print("\u001b[33m" + matrix[i][j] + "\t\u001B[0m");
        }
        else{
          System.out.print(matrix[i][j] + "\t");
        }
      }

    }
    System.out.println();
  }

   public static void populateMatrix() {
    System.out.println("Populating matrix...matrix populated");
    System.out.println();
    System.out.println("Printing matrix: ");

    rows = 0;
    columns = 0;
    do {
      for (int i = 0; i < matrix.length; i++){
        matrix[rows][columns] = ++value;
        columns++;
      }
      rows++;
      columns = 0;
    }
    while (rows < matrix.length);

    for(int i = 0; i < matrix.length; i++){
      System.out.println();
      for(int j = 0; j < matrix.length; j++){
        if(i + j == matrix.length - 1){
          System.out.print("\u001b[33m" + matrix[i][j] + "\t\u001B[0m");
        }
        else{
          System.out.print(matrix[i][j] + "\t");
        }
      }
    }
  }

  public static void flipMatrix() {
    System.out.println();
    System.out.println("Flipping matrix...matrix flipped");
    System.out.println();
    System.out.println("Printing flipped matrix: ");
    int x1 = 0;
    int input = matrix.length - 1;
    do {
      for (int i = 0; i < matrix.length; i++){
          swap(matrix, x1, input, i, matrix.length - 1 - i);
      }
      x1++;
      input--;
    } while (x1 < matrix.length / 2);

    for(int i = 0; i < matrix.length; i++){
      System.out.println();
      for(int j = 0; j < matrix.length; j++){
        if(i + j == matrix.length - 1){
          System.out.print("\u001b[33m" + matrix[i][j] + "\t\u001B[0m");
        }
        else{
          System.out.print(matrix[i][j] + "\t");
        }
      }
    }

  }
}
