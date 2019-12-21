package chap01;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		Scanner stdIn  = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n을 입력하세요");
		int  n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<=n; i++) {
			sum = sum + i;
			
		}
		System.out.println("합은 "+sum+"입니다");
	}
}
