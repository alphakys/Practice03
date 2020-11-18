package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		System.out.print("숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자: ");
		int num2 = sc.nextInt();
		
		System.out.print("숫자: ");
		int num3 = sc.nextInt();
		
		System.out.print("숫자: ");
		int num4 = sc.nextInt();
		
		System.out.print("숫자: ");
		int num5 = sc.nextInt();
		
		
		
		int[] Max = {num1,num2,num3,num4,num5};
		
		int max = Max[0];
		
		
		for(int i=0;i<Max.length;i++) 
						{
						if(max<Max[i]) {
										max=Max[i];
										}
						}System.out.println(max);
		
		
		
		
		
		
						
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	}

}
