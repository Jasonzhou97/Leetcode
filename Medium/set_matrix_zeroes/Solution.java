class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<int[]> set = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            int[] arr = matrix[i];
            for(int j=0;j<arr.length;j++){
                if(arr[j]==0){
                    int[] pos = new int[]{i, j};
                    set.add(pos);
                }
            }
        }
        for (int[] pos : set) {
            int row = pos[0];
            int col = pos[1];
            int[] arr = matrix[row];
            for (int k = 0; k < matrix.length; k++) {
                matrix[k][col] = 0;
            }
            for (int k = 0; k < arr.length; k++) {
                arr[k] = 0;
            }
        }
    }
}