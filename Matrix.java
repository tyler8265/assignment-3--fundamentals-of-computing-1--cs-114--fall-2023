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

    matrix = new int[size][size]; //Sets the values of the matrix to the user input
  }

  private static void swap(int[][] matrix, int x1, int x2, int y1, int y2) {
    if (x1 + y1 == matrix.length - 1 || x2 + y2 == matrix.length - 1){
      return;
    } //This if statement deciphers if it is apart of the highlighted indexes to prevent it from swapping if it is
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
          System.out.print("\u001B[36m" + matrix[i][j] + "\t\u001B[0m");
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

    //DoWhile loop increments the "value" variable which populates the indexes with the correct numbers for the matrix.

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
          System.out.print("\u001B[36m" + matrix[i][j] + "\t\u001B[0m"); //Prints the indexes that are diagonal with color codes
        }
        else{
          System.out.print(matrix[i][j] + "\t"); //Prints all the other indexes without color codes
        }
      }
    }
  }

  public static void flipMatrix() {
    System.out.println();
    System.out.println("Flipping matrix...matrix flipped");
    System.out.println();
    System.out.println("Printing flipped matrix: ");
    
    rows = 0;
    columns = matrix.length - 1;

    //This DoWhile loop uses the calls the swap function
    do {
      for (int i = 0; i < matrix.length; i++){
          swap(matrix, rows, columns, i, matrix.length - 1 - i);
      }
      rows++;
      columns--;
    } while (rows < matrix.length / 2);

    for(int i = 0; i < matrix.length; i++){
      System.out.println();
      for(int j = 0; j < matrix.length; j++){
        if(i + j == matrix.length - 1){
          System.out.print("\u001B[36m" + matrix[i][j] + "\t\u001B[0m");
        }
        else{
          System.out.print(matrix[i][j] + "\t");
        }
      }
    }
  }
}
