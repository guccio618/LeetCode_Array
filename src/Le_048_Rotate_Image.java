
public class Le_048_Rotate_Image {
	/*****************************************************/
	// not in place, easy to understand
	public void rotate(int[][] matrix) {
		if(matrix == null || matrix.length == 0){
            return ;
        }
        
        int row = matrix.length, col = matrix[0].length;
        int[][] rotateMatrix = new int[row][col];
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                rotateMatrix[i][j] = matrix[row - 1 - j][i];
            }
        }
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = rotateMatrix[i][j];
            }
        }
	}
	
	
	
	/*****************************************************/
	// in place
	public void rotate2(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return ;
        }
        
        int start = 0, end = matrix.length - 1;
        int temp = 0;
        
        while(start < end){
            for(int i = 0 ; i < end - start; i++){
                temp = matrix[start][start + i];
                matrix[start][start + i] = matrix[end - i][start];
                matrix[end - i][start] = matrix[end][end - i];
                matrix[end][end - i] = matrix[start + i][end];
                matrix[start + i][end] = temp;
            }
            start++;
            end--;
        }
    }
}
