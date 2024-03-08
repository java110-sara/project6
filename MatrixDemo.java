//author: Sara Russert
//date: 07 March 2024
//file: MatrixDemo.java

import java.util.Random;

public class MatrixDemo {
   public static void main(String[] args) {
      final int MATRIX1_ROWS = 4;
      final int MATRIX1_COLS = 5;
      final int MATRIX2_ROWS = 4;
      final int MATRIX2_COLS = 5;
      final int SCALAR_VALUE = 2;
      final int MAX_RAND = 99;
   
      // Instantiate a Matrix object
      // The size can be set up as constant values or obtained from the user
      Matrix m1 = new Matrix(buildMatrix(MATRIX1_ROWS, MATRIX1_COLS, MAX_RAND));
      
      // Display the Matrix by calling the toString( ) method
      String m1String = m1.toString();
      System.out.println("Matrix A:");
      System.out.println(m1String);
      
      // Transpose and display the transposed Matrix
      Matrix m1Transposed = m1.transpose();
      String m1TransposedString = m1Transposed.toString();
      System.out.println("Matrix A transposed:");
      System.out.println(m1TransposedString);
      
      // Scalar multiply and display the resultant Matrix (the scalar value can be set as a constant
      // or obtained from the user)
      Matrix m1Scaled = m1.scalarMult(SCALAR_VALUE);
      String m1ScaledString = m1Scaled.toString();
      System.out.println("Scalar Multiply " + SCALAR_VALUE + "|A|:");
      System.out.println(m1ScaledString);
      
      // Instantiate a second Matrix object
      Matrix m2 = new Matrix(buildMatrix(MATRIX2_ROWS, MATRIX2_COLS, MAX_RAND));
      
      // Display the second Matrix
      String m2String = m2.toString();
      System.out.println("Matrix B:");
      System.out.println(m2String);
      
      System.out.println("Matrix A + Matrix B:");
      // If the two are the same size, add the two Matrix objects and display resultant sum
      // Else, display error message that they cannot be added
      if (m1.sameSize(m2)) {
         Matrix addedMatricies = m1.add(m2);
         String addedMatriciesString = addedMatricies.toString();
         System.out.println(addedMatriciesString);
      } else {
         System.out.print("Matricies of different sizes cannot be combined.");
      }
   }
   
   
   // buildMatrix
   // builds the matrix data to use to instantiate a new matrix
   public static int[][] buildMatrix(int rows, int cols, int max) {
      int[][] newMatrix = new int[rows][cols];
      
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            newMatrix[i][j] = getRandomInt(max);
         }
      }
      return newMatrix;
   }
   
   
   // getRandomInt
   // returns a random int between 1-max inclusive
   public static int getRandomInt(int max) {
      Random rand = new Random();
      int num;
      
      // produce random numbers until they fit into my 1-99 bounds
      do {
         num = rand.nextInt();   
      }  while (num > max || num < 1);
      
      return num;
   }
   
}