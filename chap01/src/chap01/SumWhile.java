package chap01;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner stdIn  =new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n을 입력하세요");
		int  n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) {
			sum +=i;
			i++;

		}
				
		System.out.printf("1부터 n까지 합은 %d 입니다",sum);
	}
	
}
