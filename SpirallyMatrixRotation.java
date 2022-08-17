import java.util.ArrayList;
import java.util.List;

public class SpirallyMatrixRotation {

    public static void main(String[] args) {
        int[][] matrix={{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}};
        int r = 4, c = 4;
        List<Integer> res= spirallyTraverse(matrix);
        System.out.println(res);
    }
    static ArrayList<Integer> spirallyTraverse(int matrix[][])
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int totalRow= matrix.length;
        int totalCol= matrix[0].length;

        int count = 0;
        int totalElement = totalRow*totalCol;

        int stRow = 0;
        int stCol = 0;
        int endRow = totalRow-1;
        int endCol = totalCol-1;

        while(count < totalElement){

            //Add first row
            for(int j = stCol ; count < totalElement && j <= endCol; j++){
                ans.add(matrix[stRow][j]);
                count++;
            }
            stRow++;

            //Add last Col
            for(int j = stRow ; count < totalElement && j <= endRow ; j++){
                ans.add(matrix[j][endCol]);
                count++;
            }
            endCol--;

            //Add last Row
            for(int j = endCol ; count < totalElement && j >=  stCol ; j--){
                ans.add(matrix[endRow][j]);
                count++;
            }
            endRow--;

            //Add first Col
            for(int j = endRow ; count < totalElement && j >=  stRow ; j--){
                ans.add(matrix[j][stCol]);
                count++;
            }
            stCol++;
        }

        return ans;
    }
    static void print(int arr[][], int i, int j, int row,
                      int col,ArrayList<Integer> list)
    {
        // If i or j lies outside the matrix
        if (i >= row || j >= col) {
            return;
        }

        // Print First Row
        for (int p = i; p < col; p++) {
           list.add(arr[i][p]);
        }

        // Print Last Column
        for (int p = i + 1; p < row; p++) {
            list.add(arr[p][col - 1]);
        }

        // Print Last Row, if Last and
        // First Row are not same
        if ((row - 1) != i) {
            for (int p = row - 2; p >= j; p--) {
                list.add(arr[col - 1][p]);
            }
        }

        // Print First Column, if Last and
        // First Column are not same
        if ((row - 1) != j) {
            for (int p = col - 2; p > i; p--) {
                list.add(arr[p][j]);
            }
        }
        print(arr, i + 1, j + 1, row - 1, col - 1,list);
    }


}
