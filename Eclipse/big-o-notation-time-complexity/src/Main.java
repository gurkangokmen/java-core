
public class Main {

	public static void main(String[] args) {
		
		int n = 1000000000;
		
		// O(1)
		int a = 5*n;
		
		// O(N)
		for (int i = 0; i < n; i++) {
			a=3;
		}
		
		// O(N^2)
		for (int i = 0; i < n; i++) { //N
			for (int j = 0; j < n; j++) { //N
				a=3; //1
			}
		}
		
	}

}
