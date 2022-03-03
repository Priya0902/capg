package mocktest1;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=0;
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		char c = sc.next().charAt(0);
		for ( int i = 0; i < str.length() ; i++) {
			if(str.charAt(i)==c) {
				ans = ans + 1;
			}
		}
		System.out.println(ans);
	}

}
