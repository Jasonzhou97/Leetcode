import java.util.ArrayList;
import java.util.Scanner;

public class height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<P;i++){
            String[] line = sc.nextLine().split(" ");
            int K = Integer.parseInt(line[0]);
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=1;j<line.length-1;j++){
                arr.add(Integer.parseInt(line[j]));
            }

            int index = 0;
            int steps = 0;
            while(!inOrder(arr)){
                int cur = arr.get(index);
                for(int k=index+1;k<arr.size();k++){
                        if(arr.get(k)>cur){
                            arr.add(k,cur);
                            arr.remove(index);
                            steps+=arr.size()-k+1;
                        }
                        index++;
                }
            }
            System.out.println(K+" "+steps);
        }
    }

    static boolean inOrder(ArrayList<Integer> arr){
        int prev = arr.get(0);
        for(int i=1;i<arr.size();i++){
            int h = arr.get(i);
            if(h<prev){
                return false;
            }
        }
        return true;
    }
}
