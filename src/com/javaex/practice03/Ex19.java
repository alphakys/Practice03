package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
			
		
		int numC;  //선택
		int numS=0;  //예금
		int numD=0;  //출금
		int numB=0;  //잔고
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("---------------------------------");
		
		boolean run = true;
		
		while(run) {
		System.out.print("선택>");
			numC = sc.nextInt();
			if(numC==1) 
					{
					System.out.print("예금액>");
					numS = sc.nextInt();
					}
			
			else if(numC==2)
					{
					System.out.print("출금액");
					numD = sc.nextInt();
					}
		
			else if(numC==3)
					{
					System.out.print("잔고액");
					System.out.println(numS-numD);
					}
			else if(numC==4)
					{
					System.out.println("프로그램 종료");
					run = false;
					}
					
			else {
					System.out.println("다시 입력해주세요");
				 }
			
				}
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
	}

}
