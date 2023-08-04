/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraction;

/**
 *
 * @author taruc
 */
public class SquareMatrix implements SquareMatrixInterface{
        private int n;
        private int [][] array;

    public SquareMatrix(int n){
        this.n=n;
        this.array = new int[n][n];
    }

    @Override
    public String toString() {
        String outputStr = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                outputStr += String.format("%5d", array [i][j]);
            }
            outputStr += "\n";
        }
        return outputStr;
    }
    
    
    
    @Override
    public void makeEmpty(int m) {
        if (m >= 1 && m <= n) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = 0;
                }
            }
        }
    }

    @Override
    public void storeValue(int i, int j, int value) {
        if (i >= 1 && i <= n && j >= 1 && j <=n) {
            array[i-1][j-1]=value;
        }
    }

    @Override
    public SquareMatrixInterface add(SquareMatrixInterface m) {
        SquareMatrix givenMatrix = (SquareMatrix)m;
        if (this.n == givenMatrix.n) {
            SquareMatrix resultMatrix = new SquareMatrix(n);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    resultMatrix.array[i][j] = array[i][j] + givenMatrix.array[i][j];
                }
            }
            return resultMatrix;
        }
        return null;
    }

    @Override
    public SquareMatrixInterface copy(SquareMatrixInterface m2) {
         SquareMatrix givenMatrix = (SquareMatrix)m2;
        if (this.n == givenMatrix.n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                  array[i][j] = givenMatrix.array[i][j];
                }
            }
        }
            return null;
    }
}
