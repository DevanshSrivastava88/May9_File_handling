package ninthmay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Buffr {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter  number of digits to be converted: ");
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			System.out.println("Enter letters: ");
			String c = br.readLine();
			c=c.toUpperCase();
			for(int i=0;i<n;i++) {
				System.out.print(c.charAt(i));
			}
		}
	
	}

}
