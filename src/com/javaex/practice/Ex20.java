package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		
		System.out.print("숫자를 입력하세요: ");
		int key=sc.nextInt();
		
		System.out.println("========================");
		System.out.println("     [숫자맞추기게임 시작]     ");
		System.out.println("========================");
		
		while(true) {
			System.out.print(">>");
			int num=sc.nextInt();
			
			
			
			if(num>key) {
				System.out.println("더 낮게");
			}else if(num<key) {
				System.out.println("더 높게");
			}else if(num==key){
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y=1/n=2)");
				int end = sc.nextInt();
					if(end==1) {
						System.out.println("");
						System.out.println("========================");
						System.out.println("     [숫자맞추기게임 종료]     ");
						System.out.println("========================");
						break;
					}else {
						System.out.println("");
						System.out.print("새로운 숫자를 입력하세요: ");
						key=sc.nextInt();
						System.out.println("========================");
						System.out.println("     [숫자맞추기게임 시작]     ");
						System.out.println("========================");
						}
				}else {}
			}
		sc.close();
	}
}

