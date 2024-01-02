
public class Number_Pyramid {

	public static void main(String[] args) {
		int n = 5;
				//Space
		for(int a = 1; a<=n;a++ ) {
			for(int b = 1; b<=n-a; b++) {
				System.out.print(" ");
			}
			for(int b = 1; b<=a; b++) {
				System.out.print(a+ " ");
			}
			System.out.println();
		}
	}
}
