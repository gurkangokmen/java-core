import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
        
        System.out.print("Enter query numbers:");
        int query_numbers = read.nextInt();
        
        int[][] a_b_n = new int[query_numbers][3];
        
        for (int i = 0; i < a_b_n.length; i++) {
            a_b_n[i][0] = read.nextInt();
            a_b_n[i][1] = read.nextInt();
            a_b_n[i][2] = read.nextInt();
        }
        
        List<int[]> result = new ArrayList<int[]>();
        
        for (int i = 0; i < a_b_n.length; i++) { // loop queries
			result.add(new int[a_b_n[i][2]]); // create result list(s)
			
			for (int j = 0; j < a_b_n[i][2]; j++) { // loop n times for each query
				int element = a_b_n[i][0] + a_b_n[i][1]*2^j;
				
				if (j == 0) {result.get(i)[j] = element;}
				else {result.get(i)[j] = element + result.get(i)[j-1];}
				
			}
		}
        
        
        for (int[] i : result) {			
			for (int j = 0; j < i.length; j++) {
				System.out.print(i[j]);
			}
		}
        /**
        for (int i = 0; i < a_b_n.length; i++) {			
			for (int j = 0; j < a_b_n[i].length; j++) {
				System.out.print(a_b_n[i][j]);
			}
		}*/
        
        

	}

}
