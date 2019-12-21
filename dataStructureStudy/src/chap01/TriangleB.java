package chap01;

import java.util.Scanner;

public class TriangleB {

	public static void main(String[] args) {
		System.out.println(" 몇 단 이등변삼각형 입니까?");
		Scanner stdIn = new Scanner(System.in);
		
		int  n = stdIn.nextInt();
		
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
