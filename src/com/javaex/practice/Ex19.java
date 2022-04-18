package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		int origin = 0;
		
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1.예금  !  2.출금  !  3.잔고  !  4.종료 ");
			System.out.println("----------------------------------");
			
			System.out.print("선택>");
			int num = sc.nextInt();
			
			
			
				if(num==1) {
					System.out.print("예금액>");
					int money = sc.nextInt();
					System.out.println("");
					
					//예금액 합산
					System.out.println(origin+money);
					origin=origin+money;
				}else if(num==2) {
					System.out.print("출금액>");
					int money = sc.nextInt();
					System.out.println("");
					
					//예금액 차감
					System.out.println(origin-money);
					origin=origin-money;
				}else if(num==3) {
					System.out.print("잔고액>");
					
					//현재 잔고
					System.out.println(origin);
					System.out.println("");
				
				}else if(num==4) {
					System.out.println("프로그램 종료");
					System.out.println("");
					break;
				}else {
					System.out.println("다시 입력해주세요");
					System.out.println("");
				}
			
			}
			
			
		
		
		
		

		
		
		
		
		sc.close();

	}

}
