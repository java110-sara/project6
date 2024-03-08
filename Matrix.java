//author: Sara Russert
//date: 07 March 2024
//file: Matrix.java

public class Matrix {

   private int[][] matrixVals;
   
   // constructor
   public Matrix(int[][] mVals) {
      this.setMatrixVals(mVals);
   }
   
   // setMatrixVals
   // setter for class
   public void setMatrixVals(int[][] mVals) {
      // sets matrixVals by creating a new matrix with the same values as 
      // the arg
      int[][] valsCopy = new int[mVals.length][mVals[0].length];
      // loop through mVals
      // set each matrixVals position to the value from mVals
      for (int i = 0; i < mVals.length; i++) {
         for (int j = 0; j < mVals[0].length; j++) {
            valsCopy[i][j] = mVals[i][j];
         }
      }
      matrixVals = valsCopy;
   }

   // getMatrixVals
   // getter for class
   public int[][] getMatrixVals() {
      int[][] valuesCopy = new int[matrixVals.length][matrixVals[0].length];
      
      // copy matrixVals into valuesCopy return matrix
      for (int i = 0; i < matrixVals.length; i++) {
         for (int j = 0; j < matrixVals[0].length; j++) {
            valuesCopy[i][j] = matrixVals[i][j];
         }
      }
      
      return valuesCopy;
   }
   
   // sameSize
   // returns a boolean indicating this matrix is the same size as arg matrix
   public boolean sameSize(Matrix m2){
      int[][] m2Matrix = m2.getMatrixVals();
      int m2Rows = m2Matrix.length;
      int m2Cols = m2Matrix[0].length;
      int rows = matrixVals.length;
      int cols = matrixVals[0].length;
      
      return m2Rows == rows && m2Cols == cols;
   }
   
   // transpose
   // returns a matrix where the rows and columns of this matrix have been swapped
   public Matrix transpose() {
      int[][] transposedMatrix = new int[matrixVals[0].length][matrixVals.length];
      
      // copy matrixVals into transposedMatrix where [i][j] is [j][i]
      for (int i = 0; i < matrixVals.length; i++) {
         for (int j = 0; j < matrixVals[0].length; j++) {
            transposedMatrix[j][i] = matrixVals[i][j];
         }
      }
      return new Matrix(transposedMatrix);
   }
   
   // scalarMult
   // multiplies all matrix values by arg int
   public Matrix scalarMult(int scVal) {
   int[][] scaledMatrix = new int[matrixVals.length][matrixVals[0].length];;
      
      // copy the scaled value of each position of this matrix into the new matrix
      for (int i = 0; i < matrixVals.length; i++) {
         for (int j = 0; j < matrixVals[0].length; j++) {
            scaledMatrix[i][j] = matrixVals[i][j] * scVal;
         }
      }
      
      return new Matrix(scaledMatrix);
   }
   
   // add
   // adds a second matrix to this matrix
   public Matrix add(Matrix m2) {
      // assumes the size of the m2 matrix is the same as this matrix
      int[][] combinedMatrix = new int[matrixVals.length][matrixVals[0].length];;
      int[][] m2Matrix = m2.getMatrixVals();
      
      // add m2 values to the values of this matrix at each position
      for (int i = 0; i < matrixVals.length; i++) {
         for (int j = 0; j < matrixVals[0].length; j++) {
            combinedMatrix[i][j] = matrixVals[i][j] + m2Matrix[i][j];
         }
      }
      
      return new Matrix(combinedMatrix);
   }
   
   // toString
   // prints the matrix
   public String toString() {
      String str = "";
   
      // loop through all matrixVals and print each row
      for (int i = 0; i < matrixVals.length; i++) {
         str += "| ";
         for (int j = 0; j < matrixVals[0].length; j++) {
            str += matrixVals[i][j] + " ";
         }
         str += "|\n";
      }
      
      return str;
   }
}