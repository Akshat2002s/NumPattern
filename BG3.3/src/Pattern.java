import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("How many rows do you wnat");
		int n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);			
			}
				System.out.println();
		}

	}

}
