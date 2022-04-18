package com.javaex.practice;

import java.util.Scanner;

public class Ex11_b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num=sc.nextInt();
		
		int sum=0;

		for (int i=0; i<=num; i++) {
			sum=sum+i;
			if(num%2==0) {
				System.out.println("합계: "+sum);
			}else {
				System.out.println("합계: "+sum);
			}break;
		}
		
		
		
		
		sc.close();
		
	}

}
