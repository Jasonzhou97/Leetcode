import java.util.ArrayList;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows==0){
            return triangle;
        }
        List<Integer> first = new ArrayList<>();
        first.add(1);
        triangle.add(first);

        for(int i=1;i<numRows;i++){
            List<Integer> prev = triangle.get(i-1);
            List<Integer> cur = new ArrayList<>();
            cur.add(1);

            for(int j=1;j<i;j++){
                cur.add(prev.get(j)+prev.get(j-1));
            }
            cur.add(1);

            triangle.add(cur);
        }
        return triangle;
    }
}